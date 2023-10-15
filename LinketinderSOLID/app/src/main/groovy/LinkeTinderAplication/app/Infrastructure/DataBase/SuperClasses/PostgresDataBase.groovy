package LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.6.0')

import groovy.sql.Sql

class PostgresDataBase {

    final Sql postgres

    PostgresDataBase(){
        this.postgres = initDataBase()
    }

    public Sql initDataBase(){
        final String URL =              "jdbc:postgresql://localhost:5432/linketinder"
        final String USER =             "postgres"
        final String PASSWORD =         "V@caburra02"
        final String DRIVERCLASSNAME =  "org.postgresql.Driver"

        final Sql POSTGRESQL_DATABASE = Sql.newInstance(URL, USER, PASSWORD, DRIVERCLASSNAME)

        return  POSTGRESQL_DATABASE
    }

}
