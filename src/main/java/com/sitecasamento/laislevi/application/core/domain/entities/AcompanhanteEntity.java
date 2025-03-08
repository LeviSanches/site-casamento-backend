package com.sitecasamento.laislevi.application.core.domain.entities;

import com.sitecasamento.laislevi.application.core.domain.DTOs.AcompanhanteDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "acompanhante")
public class AcompanhanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "convidado_id", nullable = false)
    private ConvidadoEntity convidado;

    public AcompanhanteEntity() {}

    public AcompanhanteEntity(AcompanhanteDTO acompanhanteDTO) {
        BeanUtils.copyProperties(acompanhanteDTO, this);
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

    public ConvidadoEntity getConvidado() {
        return convidado;
    }

    public void setConvidado(ConvidadoEntity convidado) {
        this.convidado = convidado;
    }


}
