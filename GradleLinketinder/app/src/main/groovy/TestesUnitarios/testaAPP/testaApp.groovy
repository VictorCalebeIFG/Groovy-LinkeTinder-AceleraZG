package TestesUnitarios.testaAPP

import mainAppObjects.App
import mainAppObjects.Candidato
import mainAppObjects.Empresa

class testaApp {

    testaApp() {
        testeAdicionarCandidato()
        testeAdicionarEmpresa()
    }

    void testeAdicionarCandidato(){
        def canditatoTeste = new Candidato("testeUnitario",
                                            "testeUnitario",
                                            "testeUnitario",
                                            1,
                                            "testeUnitario",
                                            "testeUnitario",
                                    "testeUnitario")
        def testeapp = new App()

        testeapp.adicionarCandidato(canditatoTeste)

        if (testeapp.candidatos[-1].nome == "testeUnitario"){
            println("Teste adicionar candidato - OK")
        }else{
            println("Teste adicionar candidato - NOT OK")
        }

    }

    void testeAdicionarEmpresa(){
        def empresaTeste = new Empresa(
                "testeUnitario",
                "testeUnitario",
                "testeUnitario",
                "testeUnitario",
                "testeUnitario",
                "testeUnitario",
                "testeUnitario"
        )
        def testeapp = new App()

        testeapp.adicionarEmpresa(empresaTeste)

        if (testeapp.empresas[-1].nome == "testeUnitario" ){
            println("Teste adicionar Empresa - OK")
        }
        else{
            println("Teste adicionar Empresa - NOT OK")
        }

    }
}
