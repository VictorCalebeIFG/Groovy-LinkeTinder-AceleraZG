package LinkeTinderAplication.app.Domain.EntityKeeper

import LinkeTinderAplication.app.Domain.Models.Candidate
import spock.lang.Specification

class CandidateKeeperTest extends Specification{

    def "test add a candidate to CandidateKeeper"(){
        given:
        Candidate candidate1 = new Candidate()
        Candidate candidate2 = new Candidate()

        CandidateKeeper keeper = new CandidateKeeper()

        when:
        keeper.add(candidate1)
        keeper.add(candidate2)
        Integer candidatesSizeList = keeper.getCandidates().size()

        then:
        candidatesSizeList == 2

    }

    def "testing remove candidate using email"(){
        given:
        Candidate candidate1 = new Candidate()
        Candidate candidate2 = new Candidate()

        candidate1.setEmail("email1")
        candidate2.setEmail("email2")

        CandidateKeeper keeper = new CandidateKeeper()
        keeper.add(candidate1)
        keeper.add(candidate2)

        when:
        keeper.deleteUsingEmail("email1")
        List<Candidate> keeperList = keeper.getCandidates()

        then:
        keeperList[0].getEmail() == "email2"

    }

}
