package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Produit;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

public class MagasinDto {

    private Integer id;

    private String nom;

    private List<ProduitDto> produitDto;

}
