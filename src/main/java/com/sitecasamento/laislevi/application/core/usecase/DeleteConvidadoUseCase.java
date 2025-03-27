package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.core.repository.ConvidadoRepositoy;
import com.sitecasamento.laislevi.application.ports.input.DeleteConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;
import jakarta.persistence.EntityNotFoundException;

public class DeleteConvidadoUseCase implements DeleteConvidadoInputPort {

    private final ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort;

    public DeleteConvidadoUseCase(ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort) {
        this.convidadoRepositoryOutputPort = convidadoRepositoryOutputPort;
    }

    @Override
    public void delete(Long id) {
        boolean existe = convidadoRepositoryOutputPort.findById(id).isPresent();
        if (existe) {
            ConvidadoEntity convidado = convidadoRepositoryOutputPort.findById(id).get();
            convidadoRepositoryOutputPort.delete(id);
            return;
        }
        throw new EntityNotFoundException("Erro ao excluir convidado com o id: " + id);
    }
}
