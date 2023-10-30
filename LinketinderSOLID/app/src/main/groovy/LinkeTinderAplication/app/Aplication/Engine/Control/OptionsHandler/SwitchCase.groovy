package LinkeTinderAplication.app.Aplication.Engine.Control.OptionsHandler

import LinkeTinderAplication.app.Aplication.Engine.UserQuestions.InputHandler.UserInput
import LinkeTinderAplication.app.Aplication.Engine.UserQuestions.AskCommands
import LinkeTinderAplication.app.Aplication.Engine.Control.ShowData.ShowData
import LinkeTinderAplication.app.DAO.Candidate.CandidateDAO
import LinkeTinderAplication.app.DAO.Company.CompanyDAO
import LinkeTinderAplication.app.DAO.Job.JobDAO

class SwitchCase {

    public runSwitchCase(String command){
        AskCommands userInput = new AskCommands()

        switch(command){
            case "a":
                (new ShowData()).showCandidates()
                break

            case "b":
                (new ShowData().showCompanys())
                break

            case "c":
                new ShowData().showCompanyJobs(new UserInput().askInput())
                break

            case "3":
                new CandidateDAO().Insert(userInput.askUserInput(command))
                break

            case "4":
                new CompanyDAO().Insert(userInput.askUserInput(command))
                break

            case "5":
                new JobDAO().InsertUsingEmail(userInput.askUserInput(command))
                break

            case "6":
                new CandidateDAO().LinkToSkillUsingEmail(userInput.askUserInput(command))
                break

            case "7":
                new JobDAO().LinkToSkillUsingEmail(userInput.askUserInput(command))
                break

            default:
                command = ""
                break
        }

    }

}
