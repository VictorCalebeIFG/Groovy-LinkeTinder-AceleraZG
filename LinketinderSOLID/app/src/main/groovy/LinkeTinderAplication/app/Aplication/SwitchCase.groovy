package LinkeTinderAplication.app.Aplication

import LinkeTinderAplication.app.Aplication.Utils.UserQuestions.AskCommands
import LinkeTinderAplication.app.Aplication.Utils.ShowData
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.InsertInto.InsertIntoCandidate
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.InsertInto.InsertIntoCompany

class SwitchCase {

    public runSwitchCase(String command){

        switch(command){
            case "1":
                (new ShowData()).showCandidates()
                break
            case "2":
                (new ShowData().showCompanys())
                break
            case "3":
                List candidateData = (new AskCommands()).askCandidate()
                (new InsertIntoCandidate()).InsertData(candidateData)
                break
            case "4":
                List companyData = new AskCommands().askCopany()
                new InsertIntoCompany().InsertData(companyData)
                break
            default:
                command = ""
                break
        }

    }

}
