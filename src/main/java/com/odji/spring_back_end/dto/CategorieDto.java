package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Produit;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

public class CategorieDto {

    private String categorie;

    private String code;

    private String designation;

    private List<ProduitDto> produitDto;
}
