package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.SelectFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.PostgresDataBase
import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.SelectFrom.SelectFromDataBase
import groovy.sql.GroovyRowResult


class SelectFromCompany extends SelectFromDataBase{

    SelectFromCompany(){
        query = "SELECT * FROM EMPRESA"
    }

}
