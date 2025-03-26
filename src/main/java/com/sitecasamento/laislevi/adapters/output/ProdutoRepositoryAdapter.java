package com.sitecasamento.laislevi.adapters.output;

import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import com.sitecasamento.laislevi.application.core.repository.ProdutoRepository;
import com.sitecasamento.laislevi.application.ports.output.ProdutoRepositoryOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ProdutoRepositoryAdapter implements ProdutoRepositoryOutputPort {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void save(ProdutoEntity produtoEntity) {
        produtoRepository.save(produtoEntity);
    }

    @Override
    public List<ProdutoEntity> findAll() {
        return produtoRepository.findAll();
    }

    @Transactional
    @Override
    public int updateAvailability(Long id) {
        return produtoRepository.updateAvailability(id);
    }


}
