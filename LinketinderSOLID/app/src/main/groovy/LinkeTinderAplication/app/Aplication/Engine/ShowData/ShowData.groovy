package LinkeTinderAplication.app.Aplication.Engine.ShowData

import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.SelectFrom.SelectFromCandidate
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.SelectFrom.SelectFromCompany
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.SelectFrom.SelectJobsUsingEmail

class ShowData {

    public showCandidates(){
        (new SelectFromCandidate()).getData().forEach {println it}
    }

    public showCompanys(){
        (new SelectFromCompany().getData().forEach {println it})
    }

    public showCompanyJobs(String email){
        new SelectJobsUsingEmail().getDataUsingEmail(email).forEach {println it}
    }

}
