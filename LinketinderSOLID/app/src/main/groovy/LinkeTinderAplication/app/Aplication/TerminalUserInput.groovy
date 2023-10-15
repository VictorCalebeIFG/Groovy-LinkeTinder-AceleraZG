package LinkeTinderAplication.app.Aplication

import LinkeTinderAplication.app.Aplication.Utils.UserQuestions.AskCommands

class TerminalUserInput {
    Scanner scanner = new Scanner(System.in)
    SwitchCase switchcase = new SwitchCase()
    AskCommands askcommands = new  AskCommands()

    public runLoop(){
        String command = "-"

        while (command != ""){

            askcommands.askCommand()

            command = scanner.nextLine()

            switchcase.runSwitchCase(command)

        }
    }

}
