package LinkeTinderAplication.app.Aplication

import LinkeTinderAplication.app.View.FrontView
import LinkeTinderAplication.app.View.OptionsView

class AplicationLoop {
    Scanner scanner = new Scanner(System.in)
    OptionsView switchcase = new OptionsView()
    FrontView askcommands = new  FrontView()

    public runLoop(){
        String command = "-"

        while (command != ""){
            askcommands.showCommands()
            command = scanner.nextLine()
            switchcase.runSwitchCase(command)
        }
    }

}
