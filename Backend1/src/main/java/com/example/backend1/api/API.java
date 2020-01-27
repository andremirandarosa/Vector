package com.example.backend1.api;

import com.example.backend1.config.Config;
import com.example.backend1.dto.ContaDTO;
import com.example.backend1.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** Servico REST */
@RestController
public class API {
    
    @Autowired
    KafkaService kafkaService;
    
    //==========================================================================
    
    @PostMapping(Config.PATH_API)
    public ResponseEntity post(@RequestBody ContaDTO contaDTO) throws Exception{
        
        
        if((contaDTO != null) && (contaDTO.getAgencia() != null) && (contaDTO.getAgencia().length() > 0) &&
           (contaDTO.getConta() != null) && (contaDTO.getConta().length() > 0)){     
                       
            kafkaService.enviaConta(contaDTO.getAgencia(), contaDTO.getConta());
                
            return new ResponseEntity(HttpStatus.OK);
        }
        
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
