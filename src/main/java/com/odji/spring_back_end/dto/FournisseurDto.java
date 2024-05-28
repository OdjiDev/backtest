package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Facture;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

public class FournisseurDto {
                                                                                                             private String nom;
    private String prenom ;

    //private addresse du client

    private String adresse;

    private String mail;

    private String numtel;

    private List<FactureDto> factureDto;

}
