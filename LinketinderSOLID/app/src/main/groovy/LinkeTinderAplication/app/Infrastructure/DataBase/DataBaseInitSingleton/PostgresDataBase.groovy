package LinkeTinderAplication.app.Infrastructure.DataBase.DataBaseInitSingleton

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.6.0')

import groovy.sql.Sql

class PostgresDataBase {
    private static PostgresDataBase instance
    private final Sql postgres

    private PostgresDataBase() {
        this.postgres = initDataBase()
    }

    static PostgresDataBase getInstance() {
        if (instance == null) {
            instance = new PostgresDataBase()
        }
        return instance
    }

    private Sql initDataBase() {
        final String URL = "jdbc:postgresql://localhost:5432/linketinder"
        final String USER = "postgres"
        final String PASSWORD = "V@caburra02"
        final String DRIVERCLASSNAME = "org.postgresql.Driver"

        return Sql.newInstance(URL, USER, PASSWORD, DRIVERCLASSNAME)
    }

    Sql getPostgres() {
        return postgres
    }
}




