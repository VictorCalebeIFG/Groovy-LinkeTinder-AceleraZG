"use strict";
class Candidato {
    constructor(nome, email, cpf, int, estado, cep, descricao, skills) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.int = int;
        this.estado = estado;
        this.cep = cep;
        this.descricao = descricao;
        this.skills = skills;
    }
    getValues() {
        return [this.nome, this.email, this.cpf, this.int, this.estado, this.cep, this.descricao];
    }
}
