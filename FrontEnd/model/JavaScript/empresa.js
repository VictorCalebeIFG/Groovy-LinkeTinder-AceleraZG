"use strict";
class empresa {
    constructor(nome, email, cnpj, pais, estado, cep, descricao) {
        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
        this.pais = pais;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
    }
    getValues() {
        return [this.nome, this.email, this.cnpj, this.pais, this.estado, this.cep, this.descricao];
    }
}
