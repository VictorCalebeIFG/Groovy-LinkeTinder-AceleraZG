package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.InsertInto

import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.InsertInto.InsertIntoDataBase

class InsertIntoCompany extends InsertIntoDataBase{

    InsertIntoCompany(){
        query = """
            INSERT INTO EMPRESA (NOME, CNPJ, EMAIL, DESCRICAO, PAIS, CEP, SENHA)
            VALUES (?, ?, ?, ?, ?, ?, ?)
        """
    }
}
