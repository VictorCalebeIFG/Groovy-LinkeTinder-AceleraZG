package LinkeTinderAplication.app.Aplication.Utils.Terminal

class UserInput {
    Scanner scanner = new Scanner(System.in)

    public List getListFromTerminal(){
        List data = scanner.nextLine().split(",")
        return data
    }
}
