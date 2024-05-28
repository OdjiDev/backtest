package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Demande;
import com.odji.spring_back_end.model.Departement;
import jakarta.persistence.*;

import java.util.List;

public class BureauDto {

    private Integer id;

    private String nom;

    private List<DemandeDto> demandeDto;

    private DepartementDto departementDto;
}
