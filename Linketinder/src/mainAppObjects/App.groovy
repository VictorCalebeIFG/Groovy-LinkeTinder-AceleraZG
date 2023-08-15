package mainAppObjects


import mainAppObjects.DefaultDados.EmpresasDados
import mainAppObjects.DefaultDados.CanditatosDados

class App {
    List<Candidato> candidatos = []
    List<Empresa> empresas = []

    App(){
        this.iniciarDeafultData()
    }

    void adicionarCandidato(Candidato candidato){
        candidatos.add(candidato)
    }
    void adicionarEmpresa(Empresa empresa){
        empresas.add(empresa)
    }

    void pedirCandidato(){
        String  nome        = this.pedirNomeString("o Nome")
        String  email       = this.pedirNomeString("o email")
        String  cpf         = this.pedirNomeString("o CPF")
        int     idade       = this.pedirNomeInteiro("a Idade")
        String  estado      = this.pedirNomeString("o Estado")
        String  cep         = this.pedirNomeString("o CEP")
        String  descricao   = this.pedirNomeString("a descricao")

        def canditato = new Candidato(nome,email,cpf,idade,estado,cep,descricao)
        this.adicionarCandidato(canditato)
    }

    void pedirEmpresa(){
        String  nome        = this.pedirNomeString("o Nome")
        String  email       = this.pedirNomeString("o email corporativo")
        String  cnpj        = this.pedirNomeString("o cnpj")
        String  pais        = this.pedirNomeString("o Pais")
        String  estado      = this.pedirNomeString("o Estado")
        String  cep         = this.pedirNomeString("o CEP")
        String  descricao   = this.pedirNomeString("a Descricao")

        def empresa = new Empresa(nome,email,cnpj,pais,estado,cep,descricao)
        this.adicionarEmpresa(empresa)
    }

    void mostrarCadidatos(){
        candidatos.each {it.mostrarDados()}
    }
    void mostrarEmpresas(){
        empresas.each {it.mostrarDados()}
    }

    String pedirNomeString(String dado){
        def scanner = new Scanner(System.in)
        println("Digite ${dado}")
        String valorRecebido = scanner.nextLine()
        return valorRecebido
    }

    int pedirNomeInteiro(String dado){
        def scanner = new Scanner(System.in)
        println("Digite ${dado}")
        int valorRecebido = scanner.nextInt()
        return valorRecebido
    }

    void iniciarDeafultData(){
        def dadosCandidato  = new CanditatosDados()
        def dadosEmpresa    = new EmpresasDados()

        this.adicionarCandidato(dadosCandidato.candidato1)
        this.adicionarCandidato(dadosCandidato.candidato2)
        this.adicionarCandidato(dadosCandidato.candidato3)
        this.adicionarCandidato(dadosCandidato.candidato4)
        this.adicionarCandidato(dadosCandidato.candidato5)

        this.adicionarEmpresa(dadosEmpresa.empresa1)
        this.adicionarEmpresa(dadosEmpresa.empresa2)
        this.adicionarEmpresa(dadosEmpresa.empresa3)
        this.adicionarEmpresa(dadosEmpresa.empresa4)
        this.adicionarEmpresa(dadosEmpresa.empresa5)
    }
}
