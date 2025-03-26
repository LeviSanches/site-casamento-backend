package com.sitecasamento.laislevi.application.core.repository;

import com.sitecasamento.laislevi.application.core.domain.entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

    @Modifying
    @Query(value = "UPDATE produto SET disponivel = false WHERE id = :id", nativeQuery = true)
    int updateAvailability(@Param("id") Long id);
}
