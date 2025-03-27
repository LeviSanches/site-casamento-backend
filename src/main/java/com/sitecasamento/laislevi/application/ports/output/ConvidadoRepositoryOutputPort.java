package com.sitecasamento.laislevi.application.ports.output;

import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;

import java.util.List;
import java.util.Optional;

public interface ConvidadoRepositoryOutputPort {

    void save(ConvidadoEntity convidado);

    void delete(Long id);

    Optional<ConvidadoEntity> findById(Long id);

    List<ConvidadoEntity> searchAll();

}
