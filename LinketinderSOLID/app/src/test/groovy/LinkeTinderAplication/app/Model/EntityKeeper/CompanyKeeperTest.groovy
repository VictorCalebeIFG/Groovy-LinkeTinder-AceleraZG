package LinkeTinderAplication.app.Model.EntityKeeper

import LinkeTinderAplication.app.Model.Company
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
