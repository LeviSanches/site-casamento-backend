package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.adapters.output.ConvidadoRepositoryAdapter;
import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.ports.input.SearchConvidadoInputPort;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SearchConvidadoUseCase implements SearchConvidadoInputPort {

    @Autowired
    private ConvidadoRepositoryAdapter convidadoRepositoryAdapter;

    @Override
    public List<ConvidadoDTO> searchAll() {
        List<ConvidadoEntity> convidados = convidadoRepositoryAdapter.searchAll();
        if (!convidados.isEmpty()) {
            return convidados.stream()
                .map(ConvidadoDTO::new)
                .toList();
        }
        throw new EntityNotFoundException("Erro ao buscar convidados");
    }
}
