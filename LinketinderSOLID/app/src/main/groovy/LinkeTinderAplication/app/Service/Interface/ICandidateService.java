package LinkeTinderAplication.app.Service.Interface;

import LinkeTinderAplication.app.Model.Candidate;

import java.util.List;

public interface ICandidateService {
    void addCandidate(Candidate candidate);
    List <Candidate> getCandidates();
    void addSkillToCandidate(List<String> data);
}
