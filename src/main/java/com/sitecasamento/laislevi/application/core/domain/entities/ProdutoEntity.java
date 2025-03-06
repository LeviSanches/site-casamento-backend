package com.sitecasamento.laislevi.application.core.domain.entities;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Garante a geração automática do ID
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private Boolean disponivel;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private Byte quantidade;

    public ProdutoEntity(ProdutoDTO produto) {
        BeanUtils.copyProperties(produto, this);
    }

}
