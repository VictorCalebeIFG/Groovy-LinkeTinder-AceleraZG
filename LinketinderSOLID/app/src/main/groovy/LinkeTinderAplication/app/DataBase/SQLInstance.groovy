package LinkeTinderAplication.app.DataBase

import LinkeTinderAplication.app.DataBase.SingletonDataBase
import groovy.sql.GroovyRowResult
import groovy.sql.Sql

class SQLInstance {

    Sql postgres = SingletonDataBase.getInstance().getPostgres()

    public void Run(String query,List<String> args){
        postgres.execute(query,args)
    }

    public List<List<String>> Select(String query,List <String> args){
        List<List<String>> finalData = []

        List<GroovyRowResult> rawData = this.postgres.rows(query,args)

        rawData.forEach { GroovyRowResult rows ->
            finalData.add(rows.values().toList())
        }

        return finalData

    }

    public List<List<String>> Select(String query){
        List<List<String>> finalData = []

        List<GroovyRowResult> rawData = this.postgres.rows(query)

        rawData.forEach { GroovyRowResult rows ->
            finalData.add(rows.values().toList())
        }

        return finalData
    }
}
