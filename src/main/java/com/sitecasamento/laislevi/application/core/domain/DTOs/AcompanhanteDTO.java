package com.sitecasamento.laislevi.application.core.domain.DTOs;

import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import org.springframework.beans.BeanUtils;

public class AcompanhanteDTO {

    private Long id;

    private String nome;

    private ConvidadoDTO convidadoDTO;

    public AcompanhanteDTO() {}

    public AcompanhanteDTO(AcompanhanteEntity acompanhante) {
        BeanUtils.copyProperties(acompanhante, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ConvidadoDTO getConvidadoDTO() {
        return convidadoDTO;
    }

    public void setConvidadoDTO(ConvidadoDTO convidadoDTO) {
        this.convidadoDTO = convidadoDTO;
    }
}
