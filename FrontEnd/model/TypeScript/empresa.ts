class empresa{

    nome:       String;
    email:      String;
    cnpj:       String;
    pais:       String;
    estado:     String;
    cep:        String;
    descricao:  String;

    constructor(nome: String,email: String, cnpj: String, pais: String, estado: String, cep: String, descricao: String) {
        this.nome       = nome;
        this.email      = email;
        this.cnpj       = cnpj;
        this.pais       = pais;
        this.estado     = estado;
        this.cep        = cep;
        this.descricao  = descricao;
    }

    getValues(){
        return [this.nome, this.email, this.cnpj, this.pais, this.estado, this.cep, this.descricao];
    }

}