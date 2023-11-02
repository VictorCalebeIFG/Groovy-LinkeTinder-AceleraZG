package LinkeTinderAplication.app.DAO.Job

import LinkeTinderAplication.app.Model.Job

interface IJob {
    void InsertUsingEmail(List<String> jobData)
    void InsertUsingEmail(String email,Job job)
    void LinkToSkillUsingEmail(String email, String skillID)
    void LinkToSkillUsingEmail(List<String> data)
    List<List<String>> SelectUsingEmail(String email)
}