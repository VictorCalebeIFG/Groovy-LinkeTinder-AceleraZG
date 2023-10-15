package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.DeleteFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.DeleteFrom.DeleteFromDataBase

class DeleteCandidateUsingEmail extends DeleteFromDataBase{

    DeleteCandidateUsingEmail(){
        this.query = """
            Delete From Candidato Where email = ? 
        """
    }
}
