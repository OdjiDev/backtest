package com.odji.spring_back_end.dto;


import java.math.BigDecimal;
import java.util.List;

public class ProduitDto {

    private String codeproduit;

    private String nom;

    private String  designation;

    private BigDecimal quantite;

    private CategorieDto categorieDto ;

    private MagasinDto magasinDto ;

    private List<AvarieDto> avarieDto;

    private List<LigneFactureDto> lignefactureDto;

    private List<LigneFactureReparerDto> lignefacturereparerDto;

    private List<LigneReparationDto> lignereparationDto;


    private List<LigneDemandeDto> lignedemandeDto;



}
