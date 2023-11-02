package LinkeTinderAplication.app.Service.Interface

import LinkeTinderAplication.app.Model.Job

interface IJobService {
    void addJob(String email,Job job)
    void addSkillToJob(List<String> data)
    List<Job> getJobByEmail(String email)
}