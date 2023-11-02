package LinkeTinderAplication.app.View

import LinkeTinderAplication.app.Controller.JobController
import LinkeTinderAplication.app.Model.Job

class JobView {
    JobController controller = new JobController()

    void addJob(List<String> data) {
        controller.addJob(data)
    }

    void getJobByEmail(String email) {
        controller.getJobByEmail(email).forEach {println it.toString()}
    }

    void addSkillToJob(List<String> data) {
        controller.addSkillToJob(data)
    }
}
