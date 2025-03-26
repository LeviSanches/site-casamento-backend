package com.sitecasamento.laislevi.application.ports.input;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;

import java.util.List;

public interface InsertProdutoInputPort {

    void insert(List<ProdutoDTO> produto);

    int updateAvailability(Long id);
}
