package com.odji.spring_back_end.dto;

import com.odji.spring_back_end.model.Bureau;
import jakarta.persistence.Column;

import java.util.List;

public class DepartementDto {
    private Integer id;

    private String nom;

    private List<BureauDto> bureauDto;
}
