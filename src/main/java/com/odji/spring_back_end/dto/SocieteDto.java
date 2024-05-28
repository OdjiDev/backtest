package com.odji.spring_back_end.dto;
import jakarta.persistence.*;

import java.util.List;

public class SocieteDto {

    private Integer id;


    private String nom;

    private String adresse;

    private List<ContratDto> contratDto;

    private List<FactureReparerDto> facturereparerDto;


}
