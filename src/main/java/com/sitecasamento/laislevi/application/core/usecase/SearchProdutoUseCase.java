package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import com.sitecasamento.laislevi.application.ports.input.SearchProdutoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ProdutoRepositoryOutputPort;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public class SearchProdutoUseCase implements SearchProdutoInputPort {

    private final ProdutoRepositoryOutputPort produtoRepositoryOutputPort;

    public SearchProdutoUseCase(ProdutoRepositoryOutputPort produtoRepositoryOutputPort) {
        this.produtoRepositoryOutputPort = produtoRepositoryOutputPort;
    }

    @Override
    public List<ProdutoDTO> search() {
        List<ProdutoEntity> produtos = produtoRepositoryOutputPort.findAll();
        if(!produtos.isEmpty()) {
            return produtos.stream()
                    .map(ProdutoDTO::new)
                    .toList();
        }
        throw new EntityNotFoundException("Erro ao buscar produtos");
    }
}
