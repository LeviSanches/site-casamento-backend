package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.DTOs.AcompanhanteDTO;
import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.core.exceptions.InvalidArgumentException;
import com.sitecasamento.laislevi.application.ports.input.InsertConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;

public class InsertConvidadoUseCase implements InsertConvidadoInputPort {

    private final ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort;

    public InsertConvidadoUseCase(ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort) {
        this.convidadoRepositoryOutputPort = convidadoRepositoryOutputPort;
    }

    @Override
    public void insert(ConvidadoDTO convidadoDTO) {
        if (convidadoDTO != null) {
            ConvidadoEntity convidado = new ConvidadoEntity(convidadoDTO);
            for (AcompanhanteDTO acompanhanteDTO : convidadoDTO.getAcompanhantes()) {
                if(!acompanhanteDTO.getNome().isBlank() || !acompanhanteDTO.getNome().isEmpty()) {
                    AcompanhanteEntity acompanhante = new AcompanhanteEntity(acompanhanteDTO);
                    convidado.addAcompanhante(acompanhante);
                }
            }
            convidadoRepositoryOutputPort.save(convidado);
            return;
        }
        throw new InvalidArgumentException("Erro ao inserir convidado");
    }

}
