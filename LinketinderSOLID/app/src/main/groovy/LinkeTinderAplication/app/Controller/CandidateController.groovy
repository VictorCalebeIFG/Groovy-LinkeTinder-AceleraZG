package LinkeTinderAplication.app.Controller

import LinkeTinderAplication.app.Controller.Interface.ICandidateController
import LinkeTinderAplication.app.Model.Candidate
import LinkeTinderAplication.app.Service.CandidateService

class CandidateController implements ICandidateController{

    private CandidateService service = new CandidateService()

    @Override
    void addCandidate(List<String> candidateData) {
        Candidate candidate = new Candidate(candidateData)
        service.addCandidate(candidate)
    }

    @Override
    List<Candidate> getCandidates() {
        return service.getCandidates()
    }

    @Override
    void addSkillToCandidate(List candidateData) {
        service.addSkillToCandidate(candidateData)
    }
}
