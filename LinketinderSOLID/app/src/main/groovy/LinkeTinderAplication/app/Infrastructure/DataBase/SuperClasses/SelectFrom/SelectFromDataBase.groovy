package LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.SelectFrom

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.PostgresDataBase
import groovy.sql.GroovyRowResult

class SelectFromDataBase extends PostgresDataBase{
    private String query = ""

    public List<List<String>> getData(){
        List<List<String>> finalData = []

        this.postgres.rows(this.query).forEach { GroovyRowResult rows ->
            finalData.add(rows.values().toList())
        }
        return finalData
    }

    String getQuery() {
        return query
    }

    void setQuery(String query) {
        this.query = query
    }
}
