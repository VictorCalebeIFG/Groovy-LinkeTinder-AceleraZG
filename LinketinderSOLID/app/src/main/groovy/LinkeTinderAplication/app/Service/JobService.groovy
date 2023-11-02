package LinkeTinderAplication.app.Service

import LinkeTinderAplication.app.DAO.Job.JobDAO
import LinkeTinderAplication.app.Model.Job
import LinkeTinderAplication.app.Service.Interface.IJobService

class JobService implements IJobService{
    JobDAO dao = new JobDAO()

    @Override
    void addJob(String email, Job job) {
        dao.InsertUsingEmail(email,job)
    }

    @Override
    void addSkillToJob(List<String> data) {
        dao.LinkToSkillUsingEmail(data)
    }

    @Override
    List<Job> getJobByEmail(String email) {
        return dao.SelectUsingEmail(email).collect(){Job.createJob(it)}
    }
}
