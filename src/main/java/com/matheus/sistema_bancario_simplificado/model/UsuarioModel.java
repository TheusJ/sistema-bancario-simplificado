package com.matheus.sistema_bancario_simplificado.model;

import com.matheus.sistema_bancario_simplificado.enums.TipoUsuarioEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_usuario")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;

    @CPF
    @CNPJ
    @NotBlank
    @Column(unique = true)
    private String cpfCnpj;

    @Email
    @NotBlank
    @Column(unique = true)
    private String email;

    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUsuarioEnum tipoUsuario;

    @OneToOne
    private ContaModel conta;
}
