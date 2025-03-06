package com.sitecasamento.laislevi.application.core.domain.entities;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "convidado")
public class ConvidadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Garante a geração automática do ID
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Boolean statusPresenca;

    @OneToMany(mappedBy = "convidado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AcompanhanteEntity> acompanhantes;

    public ConvidadoEntity(ConvidadoDTO convidadoDTO) {
        BeanUtils.copyProperties(convidadoDTO, this);
    }

}
