package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Societe;
import jakarta.persistence.Column;

import java.time.Instant;

public class ContratDto {

    private String code;

    private Instant datedebut;

    private Instant datedefin;

    private SocieteDto societeDto ;
}
