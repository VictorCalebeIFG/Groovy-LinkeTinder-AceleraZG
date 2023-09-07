"use strict";
class vaga {
    constructor(nome, cnpj, empresa, descricao, skills) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.empresa = empresa;
        this.descricao = descricao;
        this.skills = skills;
    }
    getValues() {
        return [this.nome, this.cnpj, this.empresa, this.descricao, this.skills];
    }
}
