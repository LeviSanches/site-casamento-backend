package com.sitecasamento.laislevi.application.ports.input;

import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;

import java.util.List;

public interface InsertAcompanhanteInputPort {

    void save(List<AcompanhanteEntity> acompanhante, ConvidadoEntity convidado);
}
