package com.odji.spring_back_end.services;

import com.odji.spring_back_end.dto.ProduitDto;

public interface ProduitService {
ProduitDto save(ProduitDto dto);
ProduitDto findby(Integer id);
ProduitDto findByCodeProduit(String codeproduit);
}
