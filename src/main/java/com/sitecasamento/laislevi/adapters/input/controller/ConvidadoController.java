package com.sitecasamento.laislevi.adapters.input.controller;

import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.usecase.DeleteConvidadoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.InsertConvidadoUseCase;
import com.sitecasamento.laislevi.application.core.usecase.SearchConvidadoUseCase;
import com.sitecasamento.laislevi.application.ports.input.DeleteConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.input.InsertConvidadoInputPort;
import com.sitecasamento.laislevi.application.ports.input.SearchConvidadoInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/convidado")
public class ConvidadoController {

    @Autowired
    private InsertConvidadoInputPort insertConvidadoInputPort;

    @Autowired
    private DeleteConvidadoInputPort deleteConvidadoInputPort;

    @Autowired
    private SearchConvidadoInputPort searchConvidadoInputPort;

    @GetMapping()
    public ResponseEntity<List<ConvidadoDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(searchConvidadoInputPort.searchAll());
    }

    @PostMapping()
    public ResponseEntity<Void> insert(@RequestBody ConvidadoDTO convidado) {
        insertConvidadoInputPort.insert(convidado);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        deleteConvidadoInputPort.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
