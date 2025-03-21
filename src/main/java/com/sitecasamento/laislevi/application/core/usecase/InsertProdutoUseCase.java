package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.adapters.output.ProdutoRepositoryAdapter;
import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import com.sitecasamento.laislevi.application.ports.input.InsertProdutoInputPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InsertProdutoUseCase implements InsertProdutoInputPort {

    @Autowired
    private ProdutoRepositoryAdapter produtoRepositoryAdapter;

    @Override
    public void insert(List<ProdutoDTO> produtoDTO) {
        if (produtoDTO != null) {
            produtoDTO.stream()
                    .map(ProdutoEntity::new)
                    .forEach(p -> {
                        p.setId(null);
                        System.out.println(p);
                        produtoRepositoryAdapter.save(p);
                    });
        }
    }
}
