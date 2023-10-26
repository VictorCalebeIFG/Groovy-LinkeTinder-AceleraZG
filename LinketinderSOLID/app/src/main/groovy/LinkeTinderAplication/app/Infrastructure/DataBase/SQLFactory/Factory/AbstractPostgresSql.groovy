package LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Factory

import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Intances.SQL

abstract class AbstractPostgresSql {
    public abstract SQL createSQLInstance();
}
