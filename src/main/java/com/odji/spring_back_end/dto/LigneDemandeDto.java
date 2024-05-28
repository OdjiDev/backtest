package com.odji.spring_back_end.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LigneDemandeDto {

    private Integer id;


    private BigDecimal quantite;


    private Date date;


    private  ProduitDto produitDto;

    private List<DemandeDto> demandeDto;
}
