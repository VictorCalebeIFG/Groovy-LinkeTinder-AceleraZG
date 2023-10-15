package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.LinkTables

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.InsertInto.InsertIntoDataBase

class LinkJobToSkills extends InsertIntoDataBase{

    /*
    How to use:
    ex:
        def postgreSQL = new LinkJobToSkills()
        postgreSQL.insertData([2,2])
     */

    LinkJobToSkills(){
        query = """
        INSERT INTO COMPETENCIA_VAGA (ID_VAGA,ID_COMPETENCIA)
        VALUES (CAST(? AS INTEGER), CAST(? AS INTEGER))
        """
    }

}
