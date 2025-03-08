package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.DTOs.AcompanhanteDTO;
import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.ports.input.InsertConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertConvidadoUseCase implements InsertConvidadoInputPort {

    @Autowired
    private ConvidadoRepositoy convidadoRepositoy;

    @Autowired
    private InsertAcompanhanteUseCase insertAcompanhanteUseCase;

    @Override
    public void save(ConvidadoDTO convidadoDTO) {
        ConvidadoEntity convidado = new ConvidadoEntity(convidadoDTO);
        for (AcompanhanteDTO acompanhanteDTO : convidadoDTO.getAcompanhantes()) {
            AcompanhanteEntity acompanhante = new AcompanhanteEntity(acompanhanteDTO);
            convidado.addAcompanhante(acompanhante);
        }
        convidadoRepositoy.save(convidado);

    }

}
