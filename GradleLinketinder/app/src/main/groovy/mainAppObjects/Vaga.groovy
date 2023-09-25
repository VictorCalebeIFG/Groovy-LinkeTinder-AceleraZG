package mainAppObjects

class Vaga {
    String nome
    String descricao
    String local

    Vaga(String nome, String descricao, String local) {
        this.nome = nome
        this.descricao = descricao
        this.local = local
    }

    @Override
    String toString() {
        return "Vaga(nome: $nome, descricao: $descricao, local: $local)"
    }

    List<String> toList() {
        return [nome, descricao, local]
    }
}