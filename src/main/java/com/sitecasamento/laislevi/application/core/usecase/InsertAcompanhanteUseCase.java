package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.DTOs.AcompanhanteDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.ports.input.InsertAcompanhanteInputPort;
import com.sitecasamento.laislevi.application.ports.output.AcompanhanteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class InsertAcompanhanteUseCase implements InsertAcompanhanteInputPort {

    @Autowired
    private AcompanhanteRepository acompanhanteRepository;

    @Override
    public void save(List<AcompanhanteEntity> acompanhante, ConvidadoEntity convidado) {
        for(AcompanhanteEntity a : acompanhante) {
            a.setConvidado(convidado);
            acompanhanteRepository.save(a);
        }
    }
}
