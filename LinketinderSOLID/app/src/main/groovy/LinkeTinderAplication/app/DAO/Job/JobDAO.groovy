package LinkeTinderAplication.app.DAO.Job

import LinkeTinderAplication.app.DataBase.SQLFactory.SQLInstanceCreator
import LinkeTinderAplication.app.DataBase.SQLInstance
import LinkeTinderAplication.app.Model.Job

class JobDAO implements IJob{

    private SQLInstance sql = new SQLInstanceCreator().createSQLInstance()

    @Override
    void InsertUsingEmail(List<String> jobData) {
        sql.Run(JobEnum.INSERT_USING_EMAIL.getQuery(),jobData)
    }

    @Override
    void InsertUsingEmail(String email,Job job) {
        List<String> jobData = job.toList()
        List data = [email]

        println(jobData)
        jobData.removeAt(jobData.size() - 1)
        jobData.forEach {data.add(it)}
        sql.Run(JobEnum.INSERT_USING_EMAIL.getQuery(),data)
    }

    @Override
    void LinkToSkillUsingEmail(String email, String skillID) {
        sql.Run(JobEnum.LINK_SKILL_USING_EMAIL.getQuery(),[email, skillID])
    }

    @Override
    void LinkToSkillUsingEmail(List<String> data) {
        sql.Run(JobEnum.LINK_SKILL_USING_EMAIL.getQuery(),data)
    }

    @Override
    List<List<String>> SelectUsingEmail(String email) {
        sql.Select(JobEnum.SELECT_USING_EMAIL.getQuery(),[email])
    }
}
