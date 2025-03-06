package com.sitecasamento.laislevi.application.ports.output;

import com.sitecasamento.laislevi.application.core.domain.entities.ConvidadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepositoy extends JpaRepository<ConvidadoEntity, Long> {
}
