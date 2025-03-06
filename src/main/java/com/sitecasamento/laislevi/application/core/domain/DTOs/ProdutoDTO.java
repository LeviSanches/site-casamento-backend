package com.sitecasamento.laislevi.application.core.domain.DTOs;

import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class ProdutoDTO {

    private Long id;

    private String nome;

    private Double preco;

    private Boolean disponivel;

    private String categoria;

    private Byte quantidade;

    public ProdutoDTO(ProdutoEntity produto) {
        BeanUtils.copyProperties(produto, this);
    }

}
