package mainAppObjects

import DataBase.DataBaseUtils
import mainAppObjects.Candidato
import mainAppObjects.Empresa
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Scanner

class TerminalUtilites {

    static Candidato pedirCandidato() {
        def scanner = new Scanner(System.in)

        println("Por favor, forneça os dados do candidato:")
        print("Nome: ")
        def nome = scanner.nextLine()
        print("Sobrenome: ")
        def sobreNome = scanner.nextLine()
        print("Data de Nascimento (no formato yyyy-MM-dd): ")
        def dataNascimentoStr = scanner.nextLine()
        print("Email: ")
        def email = scanner.nextLine()
        print("CPF: ")
        def cpf = scanner.nextLine()
        print("País: ")
        def pais = scanner.nextLine()
        print("CEP: ")
        def cep = scanner.nextLine()
        print("Descrição Pessoal: ")
        def descPessoal = scanner.nextLine()
        print("Senha: ")
        def senha = scanner.nextLine()

        scanner.close()

        Candidato candidato = new Candidato(nome, sobreNome, dataNascimentoStr, email, cpf, pais, cep, descPessoal, senha)

        return candidato
    }

    static Empresa pedirEmpresa(){

        Scanner scanner = new Scanner(System.in)

        println("Por favor, forneça os dados da empresa:")
        print("Nome: ")
        def nome = scanner.nextLine()
        print("CNPJ: ")
        def cnpj = scanner.nextLine()
        print("Email: ")
        def email = scanner.nextLine()
        print("Descrição: ")
        def descricao = scanner.nextLine()
        print("País: ")
        def pais = scanner.nextLine()
        print("CEP: ")
        def cep = scanner.nextLine()
        print("Senha: ")
        def senha = scanner.nextLine()

        scanner.close()

        Empresa empresa = new Empresa(nome, cnpj, email, descricao, pais, cep, senha)

        return empresa
    }

    static void adicionarCompetencia(){
        Scanner scanner = new Scanner(System.in)

        println("Digite o ID do Candidato")
        def idCandidato = scanner.nextLine()

        println("Digite o ID Competencia")
        println(DataBaseUtils.getCompetencia())
        def idCompetencia = scanner.nextLine()

        DataBaseUtils.addCompetenciaCandidato([idCandidato as Integer, idCompetencia as Integer])


    }

    static void adicionarCompetenciaVaga(){
        Scanner scanner = new Scanner(System.in)

        println("Digite o ID da Vaga")
        def idVaga = scanner.nextLine()

        println("Digite o ID da Competencia")
        println(DataBaseUtils.getCompetencia())
        def idCompetencia = scanner.nextLine()

        DataBaseUtils.addCompetenciaVaga([idVaga as Integer, idCompetencia as Integer])


    }

    static List<String> pedirVaga() {
        Scanner scanner = new Scanner(System.in)

        println("Informe o nome da vaga:")
        String nome = scanner.nextLine()

        println("Informe a descrição da vaga:")
        String descricao = scanner.nextLine()

        println("Informe o local da vaga:")
        String local = scanner.nextLine()

        println("Informe o ID da empresa da vaga:")
        Integer idEmpresa = Integer.parseInt(scanner.nextLine())

        println("Informe o ID da vaga:")
        Integer idVaga = Integer.parseInt(scanner.nextLine())



        scanner.close()

        List<String> vagaData = [nome,descricao,local]

        DataBaseUtils.addVaga(vagaData)
        DataBaseUtils.addVagaEmpresa([idVaga,idEmpresa])

        return vagaData
    }





}
