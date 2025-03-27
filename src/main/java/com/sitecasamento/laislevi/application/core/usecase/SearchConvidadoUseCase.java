package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.ports.input.SearchConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public class SearchConvidadoUseCase implements SearchConvidadoInputPort {

    private final ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort;

    public SearchConvidadoUseCase(ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort) {
        this.convidadoRepositoryOutputPort = convidadoRepositoryOutputPort;
    }

    @Override
    public List<ConvidadoDTO> searchAll() {
        List<ConvidadoEntity> convidados = convidadoRepositoryOutputPort.searchAll();
        if (!convidados.isEmpty()) {
            return convidados.stream()
                .map(ConvidadoDTO::new)
                .toList();
        }
        throw new EntityNotFoundException("Erro ao buscar convidados");
    }
}
