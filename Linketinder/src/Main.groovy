import TestesUnitarios.testaAPP.testaApp
import mainAppObjects.App
import mainAppObjects.UserInterface
import DataBase.DataBaseUtils

static void main(String[] args) {

    //Testes Unitários (remova o "//" caso deseje rodar os testes)
    //def testeapp = new testaApp()

    //----------------------------------------
    //Criando um app do linketinder.
    def linkeTinder = new App()

    linkeTinder.pedirCandidato()

    //def userInterface = new UserInterface()
    //userInterface.startLoop(linkeTinder)
    //------------------------------------------

    DataBaseUtils dataBase = new DataBaseUtils()
    def candidatos = dataBase.getCandidatos()

    candidatos.each { candidato ->
        println(candidato.NOME)
    }


}