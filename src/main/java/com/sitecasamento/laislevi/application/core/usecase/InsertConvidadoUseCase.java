package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.ports.input.InsertConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoy;

public class InsertConvidadoUseCase implements InsertConvidadoInputPort {

    private ConvidadoRepositoy convidadoRepositoy;

    @Override
    public void save(ConvidadoDTO convidadoDTO) {
        ConvidadoEntity convidado = new ConvidadoEntity(convidadoDTO);
        convidadoRepositoy.save(convidado);
    }

}
