package LinkeTinderAplication.app.Domain.Models

import LinkeTinderAplication.app.Domain.Models.Company
import LinkeTinderAplication.app.Domain.Models.Job
import spock.lang.Specification

class CompanyTest extends Specification{

    def "testing if company job list is working"(){
        given:
        Job testJob = new Job(
                "job name",
                "job description",
                ["PYTHON", "JAVA"]
        )
        Company testCompany = new Company(
                "company name", "company cnpj",
                "company email", "company description",
                "company country","company cep",
                "company password",[testJob]
        )

        when:
        List<Job> testJobList = testCompany.getJobs()

        then:
        testJobList[0].nome == "job name"

    }

}
