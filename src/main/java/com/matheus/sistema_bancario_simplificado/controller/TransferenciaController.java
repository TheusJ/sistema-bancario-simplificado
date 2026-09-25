package com.matheus.sistema_bancario_simplificado.controller;

import com.matheus.sistema_bancario_simplificado.dto.TransferenciaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transferencia")
public class TransferenciaController {

    public ResponseEntity<TransferenciaDTO> transferir(TransferenciaDTO contaOrigem, TransferenciaDTO contaDestino){

    }
}
