package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.DBCandidateImplementation

import LinkeTinderAplication.app.Domain.Models.Candidate
import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Factory.SQLFactoryAbstract
import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Intances.SQL
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.DBCandidateInterface.DBCandidateInterface
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.EnumQuerys.DBCandidateEnum

class DBCandidateImplementation implements DBCandidateInterface{

    private SQL sql = new SQLFactoryAbstract().createSQLInstance()

    @Override
    void DeleteUsingEmail(String email) {
        this.sql.Run(DBCandidateEnum.DELETE_USING_EMAIL.getQuery(),[email])
    }

    @Override
    void Insert(List<String> candidateData) {
        sql.Run(DBCandidateEnum.INSERT.getQuery(),candidateData)
    }

    @Override
    void Insert(Candidate candidate){
        List<String> candidateData = candidate.toList()
        candidateData.removeAt(candidateData.size()-1)

        sql.Run(DBCandidateEnum.INSERT.getQuery(),candidateData)
    }

    @Override
    void LinkToSkillUsingEmail(String email, String skillID) {
        sql.Run(DBCandidateEnum.LINK_SKILL_USING_EMAI.getQuery(),[email,skillID])
    }

    @Override
    void LinkToSkillUsingEmail(List<String> CandidateData) {
        sql.Run(DBCandidateEnum.LINK_SKILL_USING_EMAI.getQuery(),CandidateData)
    }

    @Override
    List<List<String>> Select() {
        return sql.Select(DBCandidateEnum.SELECT.getQuery())
    }

    @Override
    List<List<String>> SelectUsingEmail(String email) {
        return sql.Select(DBCandidateEnum.SELECT_USING_EMAIL.getQuery(),[email])
    }
}
