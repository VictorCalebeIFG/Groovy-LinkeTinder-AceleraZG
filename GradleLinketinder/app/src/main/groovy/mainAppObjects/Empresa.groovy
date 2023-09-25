package mainAppObjects

class Empresa {
    String nome
    String cnpj
    String email
    String descricao
    String pais
    String cep
    String senha

    Empresa(String nome, String cnpj, String email, String descricao, String pais, String cep, String senha) {
        this.nome = nome
        this.cnpj = cnpj
        this.email = email
        this.descricao = descricao
        this.pais = pais
        this.cep = cep
        this.senha = senha
    }

    List<String> toList() {
        return [nome, cnpj, email, descricao, pais, cep, senha]
    }

    @Override
    String toString() {
        return "Empresa [Nome: ${nome}, CNPJ: ${cnpj}, Email: ${email}, Descrição: ${descricao}, País: ${pais}, CEP: ${cep}]"
    }
}