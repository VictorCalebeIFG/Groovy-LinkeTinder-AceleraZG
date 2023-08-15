package mainAppObjects

class Candidato {
    String nome
    String email
    String cpf
    int idade
    String estado
    String cep
    String descricaoPessoal

    Candidato(String nome,String email,String cpf, int idade, String estado, String cep,String descricaoPessoal) {
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.idade = idade
        this.estado = estado
        this.cep = cep
        this.descricaoPessoal = descricaoPessoal
    }

    void mostrarDados(){
        println("Nome:${this.nome} |")
        println("Email: ${this.email} | CPF:${this.cpf} | idade: ${this.idade}")
        println("Estado:${this.estado} | Cep: ${this.cep}")
        println("Descrição: ${this.descricaoPessoal}")
        println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    }
}
