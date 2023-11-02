package LinkeTinderAplication.app.View


import LinkeTinderAplication.app.DAO.Candidate.CandidateDAO
import LinkeTinderAplication.app.DAO.Job.JobDAO
import LinkeTinderAplication.app.Utils.UserInput

class OptionsView {

    public runSwitchCase(String command){
        FrontView userInput = new FrontView()

        switch(command){
            case "a":
                (new CandidateView()).showCandidates()
                break

            case "b":
                new CompanyView().showCompanys()
                break

            case "c":
                new JobView().getJobByEmail(new UserInput().askInput())
                break

            case "3":
                new CandidateView().addCandidate(userInput.askUserInput(command))
                break

            case "4":
                new CompanyView().addCompany(userInput.askUserInput(command))
                break

            case "5":
                new JobView().addJob(userInput.askUserInput(command))
                break

            case "6":
                new CandidateDAO().LinkToSkillUsingEmail(userInput.askUserInput(command))
                break

            case "7":
                new JobView().addSkillToJob(userInput.askUserInput(command))
                break

            default:
                command = ""
                break
        }

    }

}
