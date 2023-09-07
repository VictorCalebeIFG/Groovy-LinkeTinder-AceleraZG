class vaga{
    nome:       String;
    cnpj:       String;
    empresa:    String;
    descricao:  String;
    skills:     String[];

    constructor(nome: String,cnpj: String, empresa: String, descricao: String, skills: String[]) {
        this.nome       = nome;
        this.cnpj       = cnpj;
        this.empresa    = empresa;
        this.descricao  = descricao;
        this.skills     = skills;
    }

    getValues(){
        return [this.nome, this.cnpj, this.empresa, this.descricao, this.skills];
    }

}