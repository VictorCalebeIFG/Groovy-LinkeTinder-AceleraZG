package LinkeTinderAplication.app.Aplication.Engine.Control.OptionsHandler

import LinkeTinderAplication.app.Aplication.Engine.UserQuestions.InputHandler.UserInput
import LinkeTinderAplication.app.Aplication.Engine.UserQuestions.AskCommands
import LinkeTinderAplication.app.Aplication.Engine.Control.ShowData.ShowData
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.DBCandidateImplementation.DBCandidateImplementation
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.DBCompanyImplementation.DBCompanyImplementation
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.DBCompanyImplementation.DBJobImplementation

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
                new DBCandidateImplementation().Insert(userInput.askUserInput(command))
                break

            case "4":
                new DBCompanyImplementation().Insert(userInput.askUserInput(command))
                break

            case "5":
                new DBJobImplementation().InsertUsingEmail(userInput.askUserInput(command))
                break

            case "6":
                new DBCandidateImplementation().LinkToSkillUsingEmail(userInput.askUserInput(command))
                break

            case "7":
                new DBJobImplementation().LinkToSkillUsingEmail(userInput.askUserInput(command))
                break

            default:
                command = ""
                break
        }

    }

}
