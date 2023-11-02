package LinkeTinderAplication.app.Controller

import LinkeTinderAplication.app.Controller.Interface.IJobController
import LinkeTinderAplication.app.Model.Job
import LinkeTinderAplication.app.Service.JobService

class JobController implements IJobController{
    JobService service = new JobService()
    @Override
    void addJob(List<String> data) {
        Job job = new Job([data[1],data[2],data[3]])
        service.addJob(data[0],job)
    }

    @Override
    List<Job> getJobByEmail(String email) {
        service.getJobByEmail(email)
    }

    @Override
    void addSkillToJob(List<String> data) {
        service.addSkillToJob(data)
    }
}
