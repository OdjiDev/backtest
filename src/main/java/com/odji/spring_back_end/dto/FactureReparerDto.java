package com.odji.spring_back_end.dto;
import java.time.Instant;
import java.util.List;

public class FactureReparerDto {

    private Integer id;

    private String code;

    private Instant date;

    private SocieteDto societeDto ;

    private List<LigneFactureReparerDto> lignefacturereparerDto;

}
