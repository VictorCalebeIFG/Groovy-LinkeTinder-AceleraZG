package LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.DeleteFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.PostgresDataBase

class DeleteFromDataBase extends PostgresDataBase{

    String query = ""

    public deleteDataByEmail(String email){
        postgres.execute(query,email)
    }

}
