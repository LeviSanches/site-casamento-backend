package com.sitecasamento.laislevi.application.core.domain.entities;

import com.sitecasamento.laislevi.application.core.domain.DTOs.AcompanhanteDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "acompanhante")
public class AcompanhanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "convidado_id", nullable = false)
    private ConvidadoEntity convidado;

    public AcompanhanteEntity(AcompanhanteDTO acompanhanteDTO) {
        BeanUtils.copyProperties(acompanhanteDTO, this);
    }
}
