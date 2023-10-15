package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.SelectFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.SelectFrom.SelectFromDataBase

class SelectFromCandidate extends SelectFromDataBase{

    SelectFromCandidate(){
        query = """
            SELECT * FROM CANDIDATO
        """
    }

}
