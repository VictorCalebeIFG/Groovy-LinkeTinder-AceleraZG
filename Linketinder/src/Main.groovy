import java.util.Scanner
import App
import UserInterface

static void main(String[] args) {
    //Criando um app do linketinder.
    def linkeTinder = new App()

    def userInterface = new UserInterface()

    userInterface.startLoop(linkeTinder)


}