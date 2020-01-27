package com.example.backend2.service;

import com.example.backend2.mensagem.dto.ContaDTO;
import com.example.backend2.model.entity.Conta;
import com.example.backend2.model.repository.ContaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** Servico para Contas */
@Service
public class ContaService {
    
    @Autowired
    ContaRepository contaRepository;
    
    Logger log = LoggerFactory.getLogger(ContaService.class);
    
    //==========================================================================
    
    public Conta salvaNovaConta(ContaDTO dto){
     
        if((dto != null) &&
           (dto.getAgencia() != null) && (dto.getAgencia().length() > 0) &&
           (dto.getConta()!= null) && (dto.getConta().length() > 0)){

            Conta conta = Conta.builder()
                                    .agencia(dto.getAgencia())
                                    .conta(dto.getConta())
                                .build();

            return this.contaRepository.save(conta);
        }
        
        return null;
    }
}
