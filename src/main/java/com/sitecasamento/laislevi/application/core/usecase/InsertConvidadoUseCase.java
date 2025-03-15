package com.sitecasamento.laislevi.application.core.usecase;

import com.sitecasamento.laislevi.adapters.output.ConvidadoRepositoryAdapter;
import com.sitecasamento.laislevi.application.core.domain.DTOs.AcompanhanteDTO;
import com.sitecasamento.laislevi.application.core.domain.DTOs.ConvidadoDTO;
import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import com.sitecasamento.laislevi.application.core.exceptions.InvalidArgumentException;
import com.sitecasamento.laislevi.application.ports.input.InsertConvidadoInputPort;
import com.sitecasamento.laislevi.application.core.repository.ConvidadoRepositoy;
import com.sitecasamento.laislevi.application.ports.output.ConvidadoRepositoryOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertConvidadoUseCase implements InsertConvidadoInputPort {

    @Autowired
    private ConvidadoRepositoryAdapter convidadoRepositoryAdapter;


    @Override
    public void save(ConvidadoDTO convidadoDTO) {
        if (convidadoDTO != null) {
            ConvidadoEntity convidado = new ConvidadoEntity(convidadoDTO);
            for (AcompanhanteDTO acompanhanteDTO : convidadoDTO.getAcompanhantes()) {
                if(acompanhanteDTO.getNome() != null) {
                    AcompanhanteEntity acompanhante = new AcompanhanteEntity(acompanhanteDTO);
                    convidado.addAcompanhante(acompanhante);
                }
            }
            convidadoRepositoryAdapter.save(convidado);
            return;
        }
        throw new InvalidArgumentException("Erro ao inserir convidado");
    }

}
