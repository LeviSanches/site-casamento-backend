package com.sitecasamento.laislevi.application.ports.input;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;

public interface InsertConvidadoInputPort {

    void insert(ConvidadoDTO convidadoDTO);

}
