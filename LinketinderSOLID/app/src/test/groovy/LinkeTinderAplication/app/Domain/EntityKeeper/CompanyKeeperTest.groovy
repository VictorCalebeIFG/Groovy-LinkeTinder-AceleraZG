package LinkeTinderAplication.app.Domain.EntityKeeper

import LinkeTinderAplication.app.Domain.Models.Company
import spock.lang.Specification

class CompanyKeeperTest extends Specification{

    def "testing adding company to CompanyKeeper"(){
        given:
        Company company = new Company()
        CompanyKeeper keeper = new CompanyKeeper()

        when:
        keeper.add(company)
        Integer listSize = keeper.getCompanys().size()

        then:
        listSize == 1

    }

}
