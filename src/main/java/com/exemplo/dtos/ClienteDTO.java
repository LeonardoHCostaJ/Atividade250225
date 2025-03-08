package com.exemplo.dtos;

import com.exemplo.domains.Cliente;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ClienteDTO {

    private Integer id;

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode estar vazio")
    private String nome;

    @NotNull(message = "O campo email não pode ser nulo")
    @NotBlank(message = "O campo email não pode estar vazio")
    private String email;

    public ClienteDTO() {}

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull(message = "O campo nome não pode ser nulo") @NotBlank(message = "O campo nome não pode estar vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome não pode ser nulo") @NotBlank(message = "O campo nome não pode estar vazio") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O campo email não pode ser nulo") @NotBlank(message = "O campo email não pode estar vazio") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "O campo email não pode ser nulo") @NotBlank(message = "O campo email não pode estar vazio") String email) {
        this.email = email;
    }
}

