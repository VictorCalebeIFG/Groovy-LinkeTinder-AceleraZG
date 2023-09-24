package mainAppObjects

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
        def dataNascimento = new SimpleDateFormat("yyyy-MM-dd").parse(dataNascimentoStr)
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

        Candidato candidato = new Candidato(nome, sobreNome, dataNascimento, email, cpf, pais, cep, descPessoal, senha)

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






}
