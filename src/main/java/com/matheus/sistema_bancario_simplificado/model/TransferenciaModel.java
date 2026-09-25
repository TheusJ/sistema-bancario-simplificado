package com.matheus.sistema_bancario_simplificado.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_transferencia")
public class TransferenciaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ContaModel contaModelOrigem;

    @ManyToOne
    private ContaModel contaModelDestino;

    @CreationTimestamp
    private LocalDateTime dataEnvio;
}
