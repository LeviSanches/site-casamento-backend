package com.sitecasamento.laislevi.application.ports.input;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;

import java.util.List;

public interface SearchConvidadoInputPort {

    List<ConvidadoDTO> searchAll();
}
