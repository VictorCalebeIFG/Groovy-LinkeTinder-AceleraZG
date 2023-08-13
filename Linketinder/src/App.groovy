import Candidato
import Empresa
import CanditatosDados
import EmpresasDados
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

    void mostrarCadidatos(){
        candidatos.each {it.mostrarDados()}
    }
    void mostrarEmpresas(){
        empresas.each {it.mostrarDados()}
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
