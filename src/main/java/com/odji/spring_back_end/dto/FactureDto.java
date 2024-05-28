package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Fournisseur;
import com.odji.spring_back_end.model.LigneFacture;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.time.Instant;
import java.util.List;

public class FactureDto {

    private String code;

    private Instant datecommande;

    private FournisseurDto fournisseurDto;

    private List<LigneFactureDto> lignefacturerDto;


}
