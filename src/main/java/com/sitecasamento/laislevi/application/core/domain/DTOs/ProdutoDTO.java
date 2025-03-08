package com.sitecasamento.laislevi.application.core.domain.DTOs;

import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import org.springframework.beans.BeanUtils;

public class ProdutoDTO {

    private Long id;

    private String nome;

    private Double preco;

    private Boolean disponivel;

    private String categoria;

    private Byte quantidade;

    public ProdutoDTO() {}

    public ProdutoDTO(ProdutoEntity produto) {
        BeanUtils.copyProperties(produto, this);
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Byte getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Byte quantidade) {
        this.quantidade = quantidade;
    }
}
