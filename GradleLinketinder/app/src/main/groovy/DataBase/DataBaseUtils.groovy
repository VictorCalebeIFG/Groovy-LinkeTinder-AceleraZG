package DataBase

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.6.0')

import groovy.sql.Sql

import java.sql.Types
import java.text.SimpleDateFormat

class DataBaseUtils {
    static String url = "jdbc:postgresql://localhost:5432/linketinder"
    static String user = "postgres"
    static String password = "V@caburra02"

    static Sql sql = Sql.newInstance(url, user, password, "org.postgresql.Driver")

    static  List<String> getCandidatos(){
        // Consulta para selecionar todos os campos da tabela CANDIDATO
        def query = "SELECT * FROM CANDIDATO"

        def result = sql.rows(query)
        def candidatos = []


        result.each { row ->
            def auxList = []
            for(column in 0..row.size() -1){
                auxList.add(row[column])
            }
            candidatos.add(auxList)
        }

        return candidatos
    }

    static List<Map<String, String>> getEmpresas(){
        // Consulta para selecionar todos os campos da tabela EMPRESA
        def query = "SELECT * FROM EMPRESA"

        def result = sql.rows(query)
        def empresas = []

        result.each { row ->
            def auxList = []
            for(column in 0..row.size() -1){
                auxList.add(row[column])
            }
            empresas.add(auxList)
        }

        return empresas
    }

    static List<Map<String, String>> getCompetencia(){
        // Consulta para selecionar todos os campos da tabela EMPRESA
        def query = "SELECT * FROM COMPETENCIA"

        def result = sql.rows(query)
        def competencias = []

        result.each { row ->
            def auxList = []
            for(column in 0..row.size() -1){
                auxList.add(row[column])
            }
            competencias.add(auxList)
        }

        return competencias
    }

    static void addEmpresa(List<String> empresaData) {
        def query = """
            INSERT INTO EMPRESA (NOME, CNPJ, EMAIL, DESCRICAO, PAIS, CEP, SENHA)
            VALUES (?, ?, ?, ?, ?, ?, ?)
        """

        sql.executeInsert(query, empresaData)
    }

    static void addCandidato(List<String> candidatoData) {
        def query = """
        INSERT INTO CANDIDATO (NOME, SOBRE_NOME, DATA_NASCIMENTO, EMAIL, CPF, PAIS, CEP, DESC_PESSOAL, SENHA)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
        """

        sql.execute(query, candidatoData)
    }

    static void addCompetenciaCandidato(List<String> candidatoData){
        def query = """
        INSERT INTO COMPETENCIA_CANDIDATO (ID_CANDIDATO,ID_COMPETENCIA)
        VALUES (?, ?)
        """

        sql.execute(query, candidatoData)
    }

    static void addCompetenciaVaga(List<String> vagaData){
        def query = """
        INSERT INTO COMPETENCIA_VAGA (ID_VAGA,ID_COMPETENCIA)
        VALUES (?, ?)
        """

        sql.execute(query, vagaData)
    }

    static void addVaga(List<String> vagaData){
        def query = """
        INSERT INTO VAGA (NOME, DESCRICAO, LOCAL)
        VALUES (?, ?, ?)
        """

        sql.execute(query, vagaData)
    }

    static void addVagaEmpresa(List<String> vagaData){
        def query = """
        INSERT INTO EMPRESA_VAGA (ID_VAGA, ID_EMPREASA)
        VALUES (?, ?)
        """

        sql.execute(query, vagaData)
    }

}
