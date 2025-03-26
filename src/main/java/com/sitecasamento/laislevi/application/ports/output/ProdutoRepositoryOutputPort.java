package com.sitecasamento.laislevi.application.ports.output;

import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;

import java.util.List;

public interface ProdutoRepositoryOutputPort {

    void save(ProdutoEntity produtoEntity);

    List<ProdutoEntity> findAll();

    int updateAvailability(Long id);
}
