package com.example.backend1.service;

import com.example.backend1.config.Config;
import com.example.backend1.dto.ContaDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;

/** Servico do Kafka */
@Service
public class KafkaService {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    ObjectMapper objectMapper = new ObjectMapper();
        
    Logger log = LoggerFactory.getLogger(KafkaService.class);
    
    //==========================================================================
    
//    @KafkaListener(topics = Config.kafkaTopic, groupId = Config.kafkaGroup)
//    public void listen(String message){
//        
//        if((message != null) && (message.length() > 0)){
//        
//            log.info(">>> Received Message in Group " + Config.kafkaGroup + ": "+ message);
//            
//            ContaDTO dto = this.convertJSONToObject(message);
//            
//            if(dto != null){
//             
//                log.info(">>> Objeto convertido: " + dto);
//                
//            }
//        }
//    }
    
    public void enviaConta(String agencia, String conta){
        
        if((agencia != null) && (agencia.length() > 0) &&
           (conta != null) && (conta.length() > 0)){
            
            ContaDTO dto = ContaDTO.builder()
                                        .agencia(agencia)
                                        .conta(conta)
                                    .build();
            
            sendMessage(this.convertObjectToJSON(dto));
        }
    }
    
    //==========================================================================
    
    private String convertObjectToJSON(ContaDTO dto){
        
        if(dto != null){

            try{
                return objectMapper.writeValueAsString(dto);
            }catch(Exception e){
                log.error("Erro ao converter o objeto ContaDTO para JSON: " + dto); 
            }
        }
        
        return null;
    }
    
//    private ContaDTO convertJSONToObject(String json){
//        
//        if((json != null) && (json.length() > 0)){
//        
//            try{
//                return objectMapper.readValue(json, ContaDTO.class); 
//            }catch(Exception e){
//                log.error("Erro ao converter o JSON para Objeto ContaDTO: " + json); 
//            }
//        }
//        
//        return null;
//    }
    
    private void sendMessage(String message){
        
        if((message != null) && (message.length() > 0)){
        
            log.info(">>> Enviando mensagem para o Kafka Topic [" + Config.kafkaTopic + "]:" + message);

            kafkaTemplate.send(Config.kafkaTopic, message);
        }
    }
}
