package LinkeTinderAplication.app.Service

import LinkeTinderAplication.app.DAO.Candidate.CandidateDAO
import LinkeTinderAplication.app.Model.Candidate
import LinkeTinderAplication.app.Service.Interface.ICandidateService

class CandidateService implements ICandidateService{

    @Override
    void addCandidate(Candidate candidate) {
        CandidateDAO dao = new CandidateDAO()
        dao.Insert(candidate)
    }

    @Override
    List<Candidate> getCandidates() {
        CandidateDAO dao = new  CandidateDAO()
        List<Candidate> candidates = dao.Select().collect(){new Candidate(it)}
        return candidates
    }

    @Override
    void addSkillToCandidate(List<String> data) {
        CandidateDAO dao = new CandidateDAO()
        dao.LinkToSkillUsingEmail(data)
    }
}
