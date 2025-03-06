package com.sitecasamento.laislevi.application.core.domain.DTOs;

import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class AcompanhanteDTO {

    private Long id;

    private String nome;

    private ConvidadoDTO convidadoDTO;

    public AcompanhanteDTO() {}

    public AcompanhanteDTO(AcompanhanteEntity acompanhante) {
        BeanUtils.copyProperties(acompanhante, this);
    }

}
