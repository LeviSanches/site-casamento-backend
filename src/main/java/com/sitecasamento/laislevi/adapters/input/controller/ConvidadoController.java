package com.sitecasamento.laislevi.adapters.input.controller;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.usecase.InsertConvidadoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/convidado")
public class ConvidadoController {

    @Autowired
    private InsertConvidadoUseCase insertConvidadoUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody ConvidadoDTO convidado) {
        insertConvidadoUseCase.save(convidado);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
