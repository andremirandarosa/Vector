package com.example.backend2.service;

import com.example.backend2.config.Config;
import com.example.backend2.mensagem.dto.ContaDTO;
import com.example.backend2.model.entity.Conta;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

/** Servico do Kafka */
@Service
public class KafkaService {
        
    @Autowired
    ContaService contaService;
        
    ObjectMapper objectMapper = new ObjectMapper();
        
    Logger log = LoggerFactory.getLogger(KafkaService.class);
    
    //==========================================================================
    
    @KafkaListener(topics = Config.kafkaTopic, groupId = Config.kafkaGroup)
    public void listen(String message){
        
        if((message != null) && (message.length() > 0)){
        
            log.info(">>> Received Message in Group " + Config.kafkaGroup + ": "+ message);
            
            ContaDTO dto = this.convertJSONToObject(message);
            
            if(dto != null){
             
                log.info(">>> Objeto convertido: " + dto);
                
                Conta conta = contaService.salvaNovaConta(dto);
                
                log.info(">>> Conta salva no DB: " + conta);
            }
        }
    }
    
    //==========================================================================
    
    private ContaDTO convertJSONToObject(String json){
        
        if((json != null) && (json.length() > 0)){
        
            try{
                return objectMapper.readValue(json, ContaDTO.class); 
            }catch(Exception e){
                log.error("Erro ao converter o JSON para Objeto ContaDTO: " + json); 
            }
        }
        
        return null;
    }
}
