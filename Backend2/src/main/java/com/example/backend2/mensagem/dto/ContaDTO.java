package com.example.backend2.mensagem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** DTO da Conta */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContaDTO {
    
    private String agencia;
     
    private String conta;
    
}
