package LinkeTinderAplication.app.Aplication.Engine.OptionsHandler

import LinkeTinderAplication.app.Aplication.Engine.UserQuestions.InputHandler.UserInput
import LinkeTinderAplication.app.Aplication.Engine.UserQuestions.AskCommands
import LinkeTinderAplication.app.Aplication.Engine.ShowData.ShowData
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.InsertInto.InsertIntoCandidate
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.LinkTables.LinkCandidateToSkillsUsingEmail
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.InsertInto.InsertIntoCompany
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.InsertInto.InsertIntoJobUsingEmail
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.LinkTables.LinkJobToSkills

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
                (new InsertIntoCandidate()).InsertData(userInput.askUserInput(command))
                break

            case "4":
                new InsertIntoCompany().InsertData(userInput.askUserInput(command))
                break

            case "5":
                new InsertIntoJobUsingEmail().InsertData(userInput.askUserInput(command))
                break

            case "6":
                new LinkCandidateToSkillsUsingEmail().InsertData(userInput.askUserInput(command))
                break

            case "7":
                new LinkJobToSkills().InsertData(userInput.askUserInput(command))
                break

            default:
                command = ""
                break
        }

    }

}
