package LinkeTinderAplication.app.Domain.EntityKeeper

import LinkeTinderAplication.app.Domain.Models.Candidate
import LinkeTinderAplication.app.Domain.Utils.List.Models.removeUtils

class CandidateKeeper {
    private List<Candidate> candidates = []

    public add(Candidate candidate){
        this.candidates.add(candidate)
    }

    public deleteUsingEmail(String email){
        removeUtils.removeUsingEmail(this.candidates,email)
    }

    public List<Candidate> getCandidates() {
        return candidates
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates
    }
}
