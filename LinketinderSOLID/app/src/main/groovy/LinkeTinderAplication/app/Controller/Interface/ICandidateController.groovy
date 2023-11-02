package LinkeTinderAplication.app.Controller.Interface

import LinkeTinderAplication.app.Model.Candidate

interface ICandidateController {
    //Cria uma instânica candidato e envia para a camada service.
    void addCandidate(List<String> candidateData)
    //Pede uma lista de objetos do tipo candidato e mostra na camada view
    List<Candidate> getCandidates()

    void addSkillToCandidate(List candidateData)
}