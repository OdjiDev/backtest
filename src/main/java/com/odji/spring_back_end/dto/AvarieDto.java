package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Produit;



import java.math.BigDecimal;
import java.util.Date;

public class AvarieDto {

    private Integer id;

    private BigDecimal quantite;

    private Date date;

    private String motif;

    private ProduitDto produitDto ;
}


