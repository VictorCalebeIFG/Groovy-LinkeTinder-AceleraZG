import TestesUnitarios.testaAPP.testaApp
import mainAppObjects.App
import mainAppObjects.UserInterface

static void main(String[] args) {

    //Testes Unitários (remova o "//" caso deseje rodar os testes)
    //def testeapp = new testaApp()

    //Criando um app do linketinder.
    def linkeTinder = new App()

    def userInterface = new UserInterface()
    userInterface.startLoop(linkeTinder)
    


}