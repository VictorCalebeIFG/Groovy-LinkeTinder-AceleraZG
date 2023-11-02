package LinkeTinderAplication.app.Model.Entitys

import LinkeTinderAplication.app.Model.Candidate
import spock.lang.Specification


class CandidateTest extends Specification{

    def "testing if toList method is returnig a list"(){
        given:
        Candidate testCandidate = new Candidate(
                "candidate name",
                "candidate last name",
                "candiadate birth date",
                "candidate email",
                "candidate cpf",
                "candidate country",
                "candidate cep",
                "candidate description",
                "candidate password",
                ["skill 1","skill 2","skill 3"]
        )

        when:
        List testList = testCandidate.toList()

        then:
        testList[0] == "candidate name"

    }

}
