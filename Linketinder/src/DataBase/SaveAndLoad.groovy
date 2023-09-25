package DataBase

import mainAppObjects.Candidato
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import mainAppObjects.Candidato
import mainAppObjects.Empresa
import DataBase.DataBaseUtils

class SaveAndLoad {

    // Vai ler o banco de dados e retornar uma lista com objetos do tipo Candidato.
    static List<Candidato> LoadCandidatos() {

        List<Candidato> candidatos = DataBaseUtils.getCandidatos()
        def candidatosObjs = []

        candidatos.each { dadosCandidato ->
            Integer id = dadosCandidato[0] as Integer
            String nome = dadosCandidato[1] as String
            String sobrenome = dadosCandidato[2] as String
            String dataNascimento = dadosCandidato[3] as String
            String email = dadosCandidato[4] as String
            String cpf = dadosCandidato[5] as String
            String pais = dadosCandidato[6] as String
            String cep = dadosCandidato[7] as String
            String descPessoal = dadosCandidato[8] as String
            String senha = dadosCandidato[9] as String

            Candidato candidato = new Candidato(
                    nome,
                    sobrenome,
                    dataNascimento,
                    email,
                    cpf,
                    pais,
                    cep,
                    descPessoal,
                    senha
            )

            candidatosObjs.add(candidato)
        }

        return candidatosObjs
    }


    static List<Empresa> loadEmpresas() {
        List<Empresa> empresas = new ArrayList<>()
        def listaDados = DataBaseUtils.getEmpresas()

        listaDados.each { dadosEmpresa ->
            Integer id = dadosEmpresa[0] as Integer
            String nome = dadosEmpresa[1] as String
            String cnpj = dadosEmpresa[2] as String
            String email = dadosEmpresa[3] as String
            String descricao = dadosEmpresa[4] as String
            String pais = dadosEmpresa[5] as String
            String cep = dadosEmpresa[6] as String
            String senha = dadosEmpresa[7] as String

            Empresa empresa = new Empresa(
                    nome,
                    cnpj,
                    email,
                    descricao,
                    pais,
                    cep,
                    senha
            )

            empresas.add(empresa)
        }

        return empresas
    }









}
