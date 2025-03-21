package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.adapters.output.ProdutoRepositoryAdapter;
import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import com.sitecasamento.laislevi.application.ports.input.SearchProdutoInputPort;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SearchProdutoUseCase implements SearchProdutoInputPort {

    @Autowired
    private ProdutoRepositoryAdapter produtoRepositoryAdapter;

    @Override
    public List<ProdutoDTO> search() {
        List<ProdutoEntity> produtos = produtoRepositoryAdapter.findAll();
        if(!produtos.isEmpty()) {
            return produtos.stream()
                    .map(ProdutoDTO::new)
                    .toList();
        }
        throw new EntityNotFoundException("Erro ao buscar produtos");
    }
}
