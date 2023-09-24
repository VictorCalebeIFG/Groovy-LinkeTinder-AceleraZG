package mainAppObjects

class Candidato {
    String nome
    String sobreNome
    Date dataNascimento
    String email
    String cpf
    String pais
    String cep
    String descPessoal
    String senha

    Candidato(String nome, String sobreNome, Date dataNascimento, String email, String cpf, String pais, String cep, String descPessoal, String senha) {
        this.nome = nome
        this.sobreNome = sobreNome
        this.dataNascimento = dataNascimento
        this.email = email
        this.cpf = cpf
        this.pais = pais
        this.cep = cep
        this.descPessoal = descPessoal
        this.senha = senha
    }

    @Override
    String toString() {
        return "Candidato(nome: ${nome}, sobreNome: ${sobreNome}, dataNascimento: ${dataNascimento}, email: ${email}, cpf: ${cpf}, pais: ${pais}, cep: ${cep}, descPessoal: ${descPessoal}, senha: ${senha})"
    }
}
