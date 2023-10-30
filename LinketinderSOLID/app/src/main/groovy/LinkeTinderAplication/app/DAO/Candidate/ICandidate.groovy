package LinkeTinderAplication.app.DAO.Candidate

import LinkeTinderAplication.app.Domain.Models.Candidate

interface ICandidate {

    void DeleteUsingEmail(String email)
    void Insert(List<String> candidateData)
    void Insert(Candidate candidate)
    void LinkToSkillUsingEmail(String email, String skillID)
    void LinkToSkillUsingEmail(List<String> CandidateData)
    List<List<String>> Select()
    List<List<String>> SelectUsingEmail(String email)

}