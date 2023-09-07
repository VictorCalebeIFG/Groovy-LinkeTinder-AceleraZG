class Candidato {

    nome:       String;
    email:      String;
    cpf:        String;
    int:        number;
    estado:     String;
    cep:        String;
    descricao:  String;
    skills:     String[];

    constructor(nome: String,
                email: String, cpf: String, int: number, estado: String, cep: String, descricao: String, skills: String[]) {
        
        this.nome       = nome;
        this.email      = email;
        this.cpf        = cpf;
        this.int        = int;
        this.estado     = estado;
        this.cep        = cep;
        this.descricao  = descricao;
        this.skills     = skills;
    }

    getValues(){
        return [this.nome, this.email, this.cpf, this.int, this.estado, this.cep, this.descricao];
    }
}