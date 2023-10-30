package LinkeTinderAplication.app.DataBase

@GrabConfig(systemClassLoader=true)
@Grab(group='org.postgresql', module='postgresql', version='42.6.0')

import groovy.sql.Sql

class SingletonDataBase {
    private static SingletonDataBase instance
    private final Sql postgres

    private SingletonDataBase() {
        this.postgres = initDataBase()
    }

    static SingletonDataBase getInstance() {
        if (instance == null) {
            instance = new SingletonDataBase()
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




