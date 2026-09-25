package com.matheus.sistema_bancario_simplificado.repository;

import com.matheus.sistema_bancario_simplificado.model.TransferenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<TransferenciaModel, Long> {
}
