import TestesUnitarios.testaAPP.testaApp
import mainAppObjects.App
import mainAppObjects.UserInterface
import DataBase.DataBaseUtils

static void main(String[] args) {

    //----------------------------------------
    //Criando um app do linketinder.
    def linkeTinder = new App()


    def userInterface = new UserInterface()
    userInterface.startLoop(linkeTinder)
    //------------------------------------------


    println(DataBaseUtils.getCompetencia())

}