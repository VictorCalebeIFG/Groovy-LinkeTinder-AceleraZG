package mainAppObjects
import mainAppObjects.DefaultDados.EmpresasDados
import mainAppObjects.DefaultDados.CanditatosDados
import mainAppObjects.TerminalUtilites
import mainAppObjects.Candidato
import mainAppObjects.Empresa
import DataBase.DataBaseUtils

class App {
    List<Candidato> candidatos = []
    List<Empresa> empresas = []

    App(){

    }

    void adicionarCandidato(Candidato candidato){
        candidatos.add(candidato)
    }
    void adicionarEmpresa(Empresa empresa){
        empresas.add(empresa)
    }

    void pedirCandidato(){
        Candidato candidato = TerminalUtilites.pedirCandidato()
        this.adicionarCandidato(candidato)
    }

    void pedirEmpresa(){
        Empresa empresa = TerminalUtilites.pedirEmpresa()
        this.adicionarEmpresa(empresa)
    }

    void mostrarCadidatos(){
        candidatos.each {it.mostrarDados()}
    }
    void mostrarEmpresas(){
        empresas.each {it.mostrarDados()}
    }

}
