package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.DBCompanyImplementation

import LinkeTinderAplication.app.Domain.Models.Job
import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Factory.SQLFactoryAbstract
import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Intances.SQL
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.DBCompanyInterface.DBJobInterface
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.EnumQuerys.DBJobEnum

class DBJobImplementation implements DBJobInterface{

    private SQL sql = new SQLFactoryAbstract().createSQLInstance()

    @Override
    void InsertUsingEmail(List<String> jobData) {
        sql.Run(DBJobEnum.INSERT_USING_EMAIL.getQuery(),jobData)
    }

    @Override
    void InsertUsingEmail(Job job) {
        List<String> jobData = job.toList()
        jobData.removeAt(jobData.size() - 1)
        sql.Run(DBJobEnum.INSERT_USING_EMAIL.getQuery(), jobData)
    }

    @Override
    void LinkToSkillUsingEmail(String email, String skillID) {
        sql.Run(DBJobEnum.LINK_SKILL_USING_EMAIL.getQuery(),[email,skillID])
    }

    @Override
    void LinkToSkillUsingEmail(List<String> data) {
        sql.Run(DBJobEnum.LINK_SKILL_USING_EMAIL.getQuery(),data)
    }

    @Override
    List<List<String>> SelectUsingEmail(String email) {
        sql.Select(DBJobEnum.SELECT_USING_EMAIL.getQuery(),[email])
    }
}
