package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.DBCompanyInterface

import LinkeTinderAplication.app.Domain.Models.Job

interface DBJobInterface {
    void InsertUsingEmail(List<String> jobData)
    void InsertUsingEmail(Job job)
    void LinkToSkillUsingEmail(String email, String skillID)
    void LinkToSkillUsingEmail(List<String> data)
    List<List<String>> SelectUsingEmail(String email)
}