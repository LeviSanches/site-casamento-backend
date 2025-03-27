package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import com.sitecasamento.laislevi.application.core.exceptions.InvalidArgumentException;
import com.sitecasamento.laislevi.application.ports.input.InsertProdutoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ProdutoRepositoryOutputPort;

import java.util.List;

public class InsertProdutoUseCase implements InsertProdutoInputPort {

    private final ProdutoRepositoryOutputPort produtoRepositoryOutputPort;

    public InsertProdutoUseCase(ProdutoRepositoryOutputPort produtoRepositoryOutputPort) {
        this.produtoRepositoryOutputPort = produtoRepositoryOutputPort;
    }

    @Override
    public void insert(List<ProdutoDTO> produtoDTO) {
        if (produtoDTO != null) {
            produtoDTO.stream()
                    .map(ProdutoEntity::new)
                    .forEach(p -> {
                        p.setId(null);
                        System.out.println(p);
                        produtoRepositoryOutputPort.save(p);
                    });
        }
    }

    @Override
    public int updateAvailability(Long id) {
        if (id != null) {
            return produtoRepositoryOutputPort.updateAvailability(id);
        }
        throw new InvalidArgumentException("O ID passado para o UseCase veio nulo");
    }
}
