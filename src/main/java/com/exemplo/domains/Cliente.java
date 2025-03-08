package com.exemplo.domains;

import com.exemplo.dtos.ClienteDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_CIENTE")
    private Integer id;

    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;

    @NotNull(message = "O email não pode ser nulo")
    private String email;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Cliente(ClienteDTO dto) {
        this.id =dto.getId();
        this.nome = getNome();
        this.email = getEmail();
    }

    // Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
