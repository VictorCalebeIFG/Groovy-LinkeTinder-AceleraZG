package LinkeTinderAplication.app.DataBase.SQLFactory

import LinkeTinderAplication.app.DataBase.SQLInstance

abstract class FactoryAbstraction {
    public abstract SQLInstance createSQLInstance();
}
