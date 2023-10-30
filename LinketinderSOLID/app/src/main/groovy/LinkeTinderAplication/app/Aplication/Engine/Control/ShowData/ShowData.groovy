package LinkeTinderAplication.app.Aplication.Engine.Control.ShowData

import LinkeTinderAplication.app.DAO.Candidate.CandidateDAO
import LinkeTinderAplication.app.DAO.Company.CompanyDAO
import LinkeTinderAplication.app.DAO.Job.JobDAO


class ShowData {

    public showCandidates(){
        new CandidateDAO().Select().forEach {println it}
    }

    public showCompanys(){
        new CompanyDAO().Select().forEach {println it}
    }

    public showCompanyJobs(String email){
        new JobDAO().SelectUsingEmail(email).forEach {println it}
    }

}
