package LinkeTinderAplication.app.Aplication.Engine.UserQuestions.InputHandler

class UserInput {
    Scanner scanner = new Scanner(System.in)

    public List getListFromTerminal(){
        List data = scanner.nextLine().split(",")
        return data
    }

    public String askInput(){
        return scanner.nextLine()
    }
}
