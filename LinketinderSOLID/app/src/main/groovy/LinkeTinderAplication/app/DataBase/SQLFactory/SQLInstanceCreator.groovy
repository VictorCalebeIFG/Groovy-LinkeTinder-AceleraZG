package LinkeTinderAplication.app.DataBase.SQLFactory

import LinkeTinderAplication.app.DataBase.SQLInstance

class SQLInstanceCreator extends FactoryAbstraction{

    @Override
    SQLInstance createSQLInstance() {
        return new SQLInstance()
    }
}
