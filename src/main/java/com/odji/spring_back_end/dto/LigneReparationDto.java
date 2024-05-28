package com.odji.spring_back_end.dto;

import java.math.BigDecimal;
import java.util.Date;

public class LigneReparationDto {

    private Integer id;

    private  ProduitDto produitDto;

    private  ReparerDto reparerDto;

    private BigDecimal quantite;

    private Date date;


}
