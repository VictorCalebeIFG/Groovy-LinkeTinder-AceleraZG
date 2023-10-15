package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.LinkTables

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.InsertInto.InsertIntoDataBase

class LinkCandidateToSkillsUsingEmail extends InsertIntoDataBase{

    /*
    How to use:
    ex:
        def postgreSQL = new LinkCandidateToSkills()
        postgreSQL.insertData(["email_candidato@gmail.com",1])
     */

    LinkCandidateToSkillsUsingEmail(){
        this.query = '''
        insert into competencia_candidato (id_candidato,id_competencia)
        values (
	        (select id from candidato where email=?),
	        ?
        );
        '''
    }

}
