package LinkeTinderAplication.app.DAO.Candidate

import LinkeTinderAplication.app.DataBase.SQLFactory.SQLInstanceCreator
import LinkeTinderAplication.app.DataBase.SQLFactory.SQLInstance
import LinkeTinderAplication.app.Domain.Models.Candidate

class CandidateDAO implements ICandidate{

    private SQLInstance sql = new SQLInstanceCreator().createSQLInstance()

    @Override
    void DeleteUsingEmail(String email) {
        this.sql.Run(CandidateEnum.DELETE_USING_EMAIL.getQuery(),[email])
    }

    @Override
    void Insert(List<String> candidateData) {
        sql.Run(CandidateEnum.INSERT.getQuery(),candidateData)
    }

    @Override
    void Insert(Candidate candidate){
        List<String> candidateData = candidate.toList()
        candidateData.removeAt(candidateData.size()-1)

        sql.Run(CandidateEnum.INSERT.getQuery(),candidateData)
    }

    @Override
    void LinkToSkillUsingEmail(String email, String skillID) {
        sql.Run(CandidateEnum.LINK_SKILL_USING_EMAI.getQuery(),[email, skillID])
    }

    @Override
    void LinkToSkillUsingEmail(List<String> CandidateData) {
        sql.Run(CandidateEnum.LINK_SKILL_USING_EMAI.getQuery(),CandidateData)
    }

    @Override
    List<List<String>> Select() {
        return sql.Select(CandidateEnum.SELECT.getQuery())
    }

    @Override
    List<List<String>> SelectUsingEmail(String email) {
        return sql.Select(CandidateEnum.SELECT_USING_EMAIL.getQuery(),[email])
    }
}
