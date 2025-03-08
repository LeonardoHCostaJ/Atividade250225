package com.exemplo.domains.enums;

public enum Situacao {

    PENDENTE (0, "PENDENTE"), CONCLUIDO (1, "CONCLUIDO"), CANCELADO (2, "CANCELADO");

    private Integer id;
    private String situacao;

    Situacao(Integer id, String situacao) {
        this.id = id;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}

