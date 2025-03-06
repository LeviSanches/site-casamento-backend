package com.sitecasamento.laislevi.application.core.domain.DTOs;

import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
public class ConvidadoDTO {

    private Long id;

    private String nome;

    private String email;

    private Boolean statusPresenca;

    private List<AcompanhanteDTO> acompanhantes;

    public ConvidadoDTO() {}

    public ConvidadoDTO(ConvidadoEntity convidado) {
        BeanUtils.copyProperties(convidado, this);
    }

}
