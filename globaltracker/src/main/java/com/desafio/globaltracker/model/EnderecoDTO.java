package com.desafio.globaltracker.model;

import lombok.Data;

@Data
public class EnderecoDTO {
    private String cep;
    private String logradouro;
    private String localidade; 
    private String uf;        
}