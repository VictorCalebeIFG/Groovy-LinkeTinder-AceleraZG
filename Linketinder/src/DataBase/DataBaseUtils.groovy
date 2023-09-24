package DataBase

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.6.0')

import groovy.sql.Sql

class DataBaseUtils {
    String url = "jdbc:postgresql://localhost:5432/linketinder"
    String user = "postgres"
    String password = "V@caburra02"

    Sql sql = Sql.newInstance(url, user, password, "org.postgresql.Driver")

    List<Map<String, String>> getCandidatos(){
        // Consulta para selecionar todos os campos da tabela CANDIDATO
        def query = "SELECT * FROM CANDIDATO"

        def result = sql.rows(query)
        def candidatos = []

        result.each { row ->
            candidatos << [
                    ID: row.ID,
                    NOME: row.NOME,
                    SOBRE_NOME: row.SOBRE_NOME,
                    DATA_NASCIMENTO: row.DATA_NASCIMENTO,
                    EMAIL: row.EMAIL,
                    CPF: row.CPF,
                    PAIS: row.PAIS,
                    CEP: row.CEP,
                    DESC_PESSOAL: row.DESC_PESSOAL,
                    SENHA: row.SENHA
            ]
        }

        return candidatos
    }

    List<Map<String, String>> getEmpresas(){
        // Consulta para selecionar todos os campos da tabela EMPRESA
        def query = "SELECT * FROM EMPRESA"

        def result = sql.rows(query)
        def empresas = []

        result.each { row ->
            empresas << [
                    ID: row.ID,
                    NOME: row.NOME,
                    CNPJ: row.CNPJ,
                    EMAIL: row.EMAIL,
                    DESCRICAO: row.DESCRICAO,
                    PAIS: row.PAIS,
                    CEP: row.CEP,
                    SENHA: row.SENHA
            ]
        }

        return empresas
    }
}
