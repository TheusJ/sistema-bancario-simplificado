package com.matheus.sistema_bancario_simplificado.dto;


import com.matheus.sistema_bancario_simplificado.model.ContaModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaDTO {


    private Long id;


    private ContaModel contaModelOrigem;


    private ContaModel contaModelDestino;


    private LocalDateTime dataEnvio;
}
