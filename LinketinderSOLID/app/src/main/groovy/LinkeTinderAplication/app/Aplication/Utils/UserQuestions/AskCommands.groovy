package LinkeTinderAplication.app.Aplication.Utils.UserQuestions

import LinkeTinderAplication.app.Aplication.Utils.Terminal.UserInput

class AskCommands {
    public askCommand(){
        println("1 > Show Candidates")
        println("2 > Show Companys")
        println("3 > Add Candidate")
        println("4 > Add Company")
    }

    public askCandidate(){
        println "digite tudo na mesma linha: NOME, SOBRE_NOME, DATA_NASCIMENTO, EMAIL, CPF, PAIS, CEP, DESC_PESSOAL, SENHA"
        return (new UserInput()).getListFromTerminal()
    }

    public askCopany(){
        println "digite tudo na mesma linha: NOME, CNPJ, EMAIL, DESCRICAO, PAIS, CEP, SENHA"
        return (new UserInput()).getListFromTerminal()
    }
}
