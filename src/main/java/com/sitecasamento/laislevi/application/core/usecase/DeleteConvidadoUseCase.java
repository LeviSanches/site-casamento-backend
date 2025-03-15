package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.ports.input.DeleteConvidadoInputPort;
import com.sitecasamento.laislevi.application.core.repository.ConvidadoRepositoy;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteConvidadoUseCase implements DeleteConvidadoInputPort {

    @Autowired
    ConvidadoRepositoryOutputPort convidadoRepositoryOutputPort;

    @Autowired
    ConvidadoRepositoy convidadoRepositoy;

    @Override
    public void delete(Long id) {
        boolean existe = convidadoRepositoy.findById(id).isPresent();
        if (existe) {
            ConvidadoEntity convidado = convidadoRepositoy.findById(id).get();
            convidadoRepositoryOutputPort.delete(id);
            return;
        }
        throw new EntityNotFoundException("Erro ao excluir convidado com o id: " + id);
    }
}
