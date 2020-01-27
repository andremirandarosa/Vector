package com.example.backend2.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "conta")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Conta {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE) 
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
            
    @Column(name = "agencia")
    private String agencia;
    
    @Column(name = "conta")  
    private String conta;
    
}
