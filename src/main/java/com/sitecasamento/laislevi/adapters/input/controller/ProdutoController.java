package com.sitecasamento.laislevi.adapters.input.controller;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;
import com.sitecasamento.laislevi.application.core.usecase.InsertProdutoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.SearchProdutoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private InsertProdutoUseCase insertProdutoUseCase;

    @Autowired
    private SearchProdutoUseCase searchProdutoUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody List<ProdutoDTO> produtos) {
        insertProdutoUseCase.insert(produtos);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll() {
        return new ResponseEntity<>(searchProdutoUseCase.search(), HttpStatus.OK);
    }
}
