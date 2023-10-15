package LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.InsertInto

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.PostgresDataBase

class InsertIntoDataBase extends PostgresDataBase{
    private String query = ""

    public InsertData(List<String> data){
        this.postgres.execute(query,data)
    }

    String getQuery() {
        return query
    }

    void setQuery(String query) {
        this.query = query
    }
}
