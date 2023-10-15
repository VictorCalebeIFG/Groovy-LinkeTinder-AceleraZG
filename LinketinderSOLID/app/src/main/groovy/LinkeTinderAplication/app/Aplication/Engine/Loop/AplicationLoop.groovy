package LinkeTinderAplication.app.Aplication.Engine.Loop

import LinkeTinderAplication.app.Aplication.Engine.Control.OptionsHandler.SwitchCase
import LinkeTinderAplication.app.Aplication.Engine.UserQuestions.AskCommands

class AplicationLoop {
    Scanner scanner = new Scanner(System.in)
    SwitchCase switchcase = new SwitchCase()
    AskCommands askcommands = new  AskCommands()

    public runLoop(){
        String command = "-"

        while (command != ""){
            askcommands.showCommands()
            command = scanner.nextLine()
            switchcase.runSwitchCase(command)
        }
    }

}
