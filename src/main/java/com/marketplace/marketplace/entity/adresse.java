package com.marketplace.marketplace.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class adresse {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ville;
    private String region;
    private String codePostale;
    private String rue;
    
    @OneToOne
    private utilisateur utilisateur;
    
}
