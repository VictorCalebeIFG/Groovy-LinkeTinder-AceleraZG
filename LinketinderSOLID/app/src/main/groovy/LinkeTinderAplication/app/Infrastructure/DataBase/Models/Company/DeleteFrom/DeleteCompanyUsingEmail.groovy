package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.DeleteFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.DeleteFrom.DeleteFromDataBase

class DeleteCompanyUsingEmail extends DeleteFromDataBase{

    DeleteCompanyUsingEmail(){
        query = """
            DELETE FROM EMPRESA WHERE EMAIL = ?
        """
    }

}
