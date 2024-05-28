package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Facture;
import com.odji.spring_back_end.model.Produit;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;
import java.util.Date;

public class LigneFactureDto {

    private ProduitDto produitDto;

    private FactureDto factureDto;

    private BigDecimal quantite;

    private Date date;

}

