package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.InsertInto

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.InsertInto.InsertIntoDataBase

class InsertIntoJobUsingEmail extends InsertIntoDataBase{

    /*
    How to use:
    ex:
        def postgreSQL = new InsertIntoJobUnsingEmail()
        postgreSQL.insertData(["email_company@gmail.com","nome vaga","descricao vaga","local vaga"])
     */

    InsertIntoJobUsingEmail(){
        query = """
        INSERT INTO VAGA(
                EMPRESA_ID,
                NOME,
                DESCRICAO,
                LOCAL
        )
        VALUES(
            (SELECT ID FROM EMPRESA WHERE EMAIL = ?),
            ?,
            ?,
            ?'
        )
        """
    }
}
