package LinkeTinderAplication.app.View

import LinkeTinderAplication.app.Utils.UserInput

class FrontView {
    public showCommands(){
        String bigspacing = "\t\t\t\t\t"
        String smallspacing = "\t"

        println "<a> Show Candidates"               +bigspacing+       "<3>Add Candidate"   +bigspacing+   "<6>Add Skill to Candidate"
        println "<b> Show Companys"                 +bigspacing+       "<4>Add Company"     +bigspacing+   "\t<7>Add Skill to Job"
        println "<c> Show Company Jobs Using Email" +smallspacing+     "<5>Add Job"
        println ""
    }

    private Map userInputMap = [
            "3":"Digite tudo na mesma linha: NOME, SOBRE_NOME, DATA_NASCIMENTO, EMAIL, CPF, PAIS, CEP, DESC_PESSOAL, SENHA",
            "4":"Digite tudo na mesma linha: NOME, CNPJ, EMAIL, DESCRICAO, PAIS, CEP, SENHA",
            "5":"Digite tudo na mesma linha: email_company@gmail.com,nome vaga,descricao vaga,local vaga",
            "6":"Digite tudo na mesma linha: email_candidato@gmail.com,SKILL_ID(1...16)",
            "7":"Digite tudo na mesma linha: vaga_id,skill_id(1...16)"
    ]

    public List<String> askUserInput(String command){
        println this.userInputMap[command]
        return new UserInput().getListFromTerminal()
    }


}
