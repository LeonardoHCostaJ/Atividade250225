package com.exemplo.domains;

import com.exemplo.domains.enums.Situacao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedido")
    private Long id;

    @NotNull
    private LocalDateTime data;

    @NotNull
    private Double total;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "statuspedido")
    private Situacao situacao;

    // Construtores
    public Pedido() {
    this.situacao = Situacao.PENDENTE;
    }

    public Pedido(Long id, LocalDateTime data, Double total, Cliente cliente, Situacao situacao) {
        this.id = id;
        this.data = data;
        this.total = total;
        this.cliente = cliente;
        this.situacao = situacao;
    }

    // Getters e Setters
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id) && Objects.equals(data, pedido.data) && Objects.equals(total, pedido.total) && Objects.equals(cliente, pedido.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data, total, cliente);
    }
}


