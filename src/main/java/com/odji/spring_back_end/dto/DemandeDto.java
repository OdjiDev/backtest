package com.odji.spring_back_end.dto;

import jakarta.persistence.Column;

public class DemandeDto {

    private Integer id;

    private String motif;

    private  LigneDemandeDto lignedemandeDto;

    private  BureauDto bureauDto;

}
