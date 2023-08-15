package mainAppObjects

class Empresa {
    String nome
    String emailCorporativo
    String cnpj
    String pais
    String estado
    String cep
    String descricaoEmpresa

    Empresa(String nome, String emailCorporativo, String cnpj, String pais, String estado, String cep, String descricaoEmpresa) {
        this.nome               = nome
        this.emailCorporativo   = emailCorporativo
        this.cnpj               = cnpj
        this.pais               = pais
        this.estado             = estado
        this.cep                = cep
        this.descricaoEmpresa   = descricaoEmpresa
    }

    void mostrarDados(){
        println("Nome:${this.nome} |")
        println("Email: ${this.emailCorporativo} | CNPJ:${this.cnpj} | País: ${this.pais}")
        println("Estado:${this.estado} | Cep: ${this.cep}")
        println("Descrição: ${this.descricaoEmpresa}")
        println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-")
    }
}
