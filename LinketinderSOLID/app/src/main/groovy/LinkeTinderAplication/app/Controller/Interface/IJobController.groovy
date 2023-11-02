package LinkeTinderAplication.app.Controller.Interface

import LinkeTinderAplication.app.Model.Job

interface IJobController {
    void addJob(List<String>data)
    List<Job> getJobByEmail(String email)
    void addSkillToJob(List<String> data)
}