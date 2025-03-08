package com.sitecasamento.laislevi.application.ports.output;

import com.sitecasamento.laislevi.application.core.domain.entities.AcompanhanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcompanhanteRepository extends JpaRepository<AcompanhanteEntity, Long> {
}
