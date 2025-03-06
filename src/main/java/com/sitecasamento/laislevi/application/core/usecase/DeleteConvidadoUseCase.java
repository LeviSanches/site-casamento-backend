package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.application.ports.input.DeleteConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoy;

public class DeleteConvidadoUseCase implements DeleteConvidadoInputPort {

    private ConvidadoRepositoy convidadoRepositoy;

    @Override
    public void delete(Long id) {
        convidadoRepositoy.deleteById(id);
    }
}
