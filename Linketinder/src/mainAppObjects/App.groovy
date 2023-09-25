package mainAppObjects
import mainAppObjects.DefaultDados.EmpresasDados
import mainAppObjects.DefaultDados.CanditatosDados
import mainAppObjects.TerminalUtilites
import mainAppObjects.Candidato
import mainAppObjects.Empresa
import mainAppObjects.Vaga
import DataBase.DataBaseUtils
import DataBase.SaveAndLoad

class App {
    List<Candidato> candidatos = []
    List<Empresa> empresas = []
    List<Empresa> vagas = []

    App(){
        candidatos = SaveAndLoad.LoadCandidatos()
        empresas = SaveAndLoad.loadEmpresas()
    }

    void adicionarCandidato(Candidato candidato){
        candidatos.add(candidato)
        DataBaseUtils.addCandidato(candidato.toList())
    }
    void adicionarEmpresa(Empresa empresa){
        empresas.add(empresa)
        DataBaseUtils.addEmpresa(empresa.toList())
    }

    void adicionarVaga(Vaga vaga){
        vagas.add(vaga)
    }

    void pedirCandidato(){
        Candidato candidato = TerminalUtilites.pedirCandidato()
        this.adicionarCandidato(candidato)
    }

    void pedirEmpresa(){
        Empresa empresa = TerminalUtilites.pedirEmpresa()
        this.adicionarEmpresa(empresa)
    }

    void pedirCompetencias(){
        TerminalUtilites.adicionarCompetencia()
    }

    void pedirCompetenciasVaga(){
        TerminalUtilites.adicionarCompetenciaVaga()
    }

    void mostrarCadidatos(){
        candidatos.each {println(it.toString())}
    }
    void mostrarEmpresas(){
        empresas.each {println(it.toString())}
    }

    void pedirVaga(){
        Vaga vaga = TerminalUtilites.pedirVaga()
        this.adicionarVaga(vaga)
    }

}
