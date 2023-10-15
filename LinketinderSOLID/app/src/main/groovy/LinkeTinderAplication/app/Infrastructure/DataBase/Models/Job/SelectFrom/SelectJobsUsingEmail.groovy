package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.SelectFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.SelectFrom.SelectFromWhereDataBase

class SelectJobsUsingEmail extends SelectFromWhereDataBase{
    /*
    How to use:
    ex:
        def postgre = new SelectJobsUsingEmail()
        postgre.getDataUsingEmail("email_company@gmail.com")
     */

    SelectJobsUsingEmail(){
        this.query = """
        Select * from vaga
        where empresa_id = (select id from empresa where email = ?);
        """
    }

}
