package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.EnumQuerys

enum DBCompanyEnum {

    DELETE_USING_EMAIL(" DELETE FROM EMPRESA WHERE EMAIL = ? "),

    INSERT("""
    INSERT INTO EMPRESA (NOME, CNPJ, EMAIL, DESCRICAO, PAIS, CEP, SENHA)
    VALUES (?, ?, ?, ?, ?, ?, ?)  """),

    SELECT("Select * from empresa"),

    SELECT_USING_EMAIL("Select * from empresa where email = (?)")

    final String query

    DBCompanyEnum(String query){
        this.query = query
    }

    String getQuery(){
        return query
    }
}