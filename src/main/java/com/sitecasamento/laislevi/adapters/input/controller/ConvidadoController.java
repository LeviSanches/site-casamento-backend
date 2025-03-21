package com.sitecasamento.laislevi.adapters.input.controller;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.usecase.DeleteConvidadoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.InsertConvidadoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.SearchConvidadoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/convidado")
public class ConvidadoController {

    @Autowired
    private InsertConvidadoUseCase insertConvidadoUseCase;

    @Autowired
    private DeleteConvidadoUseCase deleteConvidadoUseCase;

    @Autowired
    private SearchConvidadoUseCase searchConvidadoUseCase;

    @GetMapping()
    public ResponseEntity<List<ConvidadoDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(searchConvidadoUseCase.searchAll());
    }

    @PostMapping()
    public ResponseEntity<Void> insert(@RequestBody ConvidadoDTO convidado) {
        insertConvidadoUseCase.insert(convidado);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        deleteConvidadoUseCase.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
