package com.sitecasamento.laislevi.adapters.output;

import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.core.repository.ConvidadoRepositoy;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ConvidadoRepositoryAdapter implements ConvidadoRepositoryOutputPort {

    @Autowired
    private ConvidadoRepositoy convidadoRepositoy;

    @Override
    public void save(ConvidadoEntity convidado) {
        convidadoRepositoy.save(convidado);
    }

    @Override
    public void delete(Long id) {
        convidadoRepositoy.deleteById(id);
    }

    @Override
    public List<ConvidadoEntity> searchAll() {
        return convidadoRepositoy.findAll();
    }
}
