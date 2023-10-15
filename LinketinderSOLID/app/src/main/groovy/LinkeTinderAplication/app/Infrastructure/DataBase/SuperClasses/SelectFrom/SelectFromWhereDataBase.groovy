package LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.SelectFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.PostgresDataBase
import groovy.sql.GroovyRowResult

class SelectFromWhereDataBase extends PostgresDataBase{
    String query = ""

    public getDataUsingEmail(String email){
        List<List<String>> finalData = []

        this.postgres.rows(this.query,[email]).forEach { GroovyRowResult rows ->
            finalData.add(rows.values().toList())
        }

        return finalData
    }

}
