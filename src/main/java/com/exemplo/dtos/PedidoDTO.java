package com.exemplo.dtos;

import com.exemplo.domains.Pedido;
import com.exemplo.domains.enums.Situacao;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class PedidoDTO {

    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime data;

    @NotNull(message = "O campo total não pode ser nulo")
    @Digits(integer = 15 , fraction = 2)
    private Double total;


    private int situacao;
    private int clienteId;

    public PedidoDTO(Pedido pedido) {
        this.id = pedido.getId();
        this.data = pedido.getData();
        this.total = pedido.getTotal();
        this.situacao = pedido.getSituacao().getId();
        this.clienteId = pedido.getCliente().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public @NotNull(message = "O campo total não pode ser nulo") @Digits(integer = 15, fraction = 2) Double getTotal() {
        return total;
    }

    public void setTotal(@NotNull(message = "O campo total não pode ser nulo") @Digits(integer = 15, fraction = 2) Double total) {
        this.total = total;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}