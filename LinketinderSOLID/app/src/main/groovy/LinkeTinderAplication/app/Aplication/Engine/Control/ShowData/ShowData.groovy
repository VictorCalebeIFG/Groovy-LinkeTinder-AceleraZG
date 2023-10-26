package LinkeTinderAplication.app.Aplication.Engine.Control.ShowData

import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.DBCandidateImplementation.DBCandidateImplementation
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.DBCompanyImplementation.DBCompanyImplementation
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.DBCompanyImplementation.DBJobImplementation


class ShowData {

    public showCandidates(){
        new DBCandidateImplementation().Select().forEach {println it}
    }

    public showCompanys(){
        new DBCompanyImplementation().Select().forEach {println it}
    }

    public showCompanyJobs(String email){
        new DBJobImplementation().SelectUsingEmail(email).forEach {println it}
    }

}
