package com.sitecasamento.laislevi.adapters.input.controller;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ProdutoDTO;
import com.sitecasamento.laislevi.application.core.usecase.InsertProdutoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.SearchProdutoUseCase;
import com.sitecasamento.laislevi.application.ports.input.InsertProdutoInputPort;
import com.sitecasamento.laislevi.application.ports.input.SearchProdutoInputPort;
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
    private InsertProdutoInputPort insertProdutoInputPort;

    @Autowired
    private SearchProdutoInputPort searchProdutoInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody List<ProdutoDTO> produtos) {
        insertProdutoInputPort.insert(produtos);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll() {
        return new ResponseEntity<>(searchProdutoInputPort.search(), HttpStatus.OK);
    }
}
