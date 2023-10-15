package LinkeTinderAplication.app.Aplication.Utils

import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.SelectFrom.SelectFromCandidate
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.SelectFrom.SelectFromCompany

class ShowData {

    public showCandidates(){
        (new SelectFromCandidate()).getData().forEach {println it}
    }

    public showCompanys(){
        (new SelectFromCompany().getData().forEach {println it})
    }

}
