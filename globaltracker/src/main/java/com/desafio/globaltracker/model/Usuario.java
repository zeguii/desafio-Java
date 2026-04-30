package com.desafio.globaltracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity 
@Data 
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(nullable = false) 
    private String nome;

    @Column(nullable = false, unique = true) 
    private String email;
}