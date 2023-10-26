package LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Factory


import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Intances.SQL

class SQLFactoryAbstract extends AbstractPostgresSql{

    @Override
    SQL createSQLInstance() {
        return new SQL()
    }
}
