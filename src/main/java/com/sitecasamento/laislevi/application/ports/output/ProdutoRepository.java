package com.sitecasamento.laislevi.application.ports.output;

import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
