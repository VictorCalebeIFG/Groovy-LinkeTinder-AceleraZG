package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.DBCompanyImplementation

import LinkeTinderAplication.app.Domain.Models.Company
import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Factory.SQLFactoryAbstract
import LinkeTinderAplication.app.Infrastructure.DataBase.SQLFactory.Intances.SQL
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.DBCompanyInterface.DBCompanyInterface
import LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.EnumQuerys.DBCompanyEnum

class DBCompanyImplementation implements DBCompanyInterface{

    private SQL sql = new SQLFactoryAbstract().createSQLInstance()

    @Override
    void DeleteUsingEmail(String email) {
        sql.Run(DBCompanyEnum.DELETE_USING_EMAIL.getQuery(),[email])
    }

    @Override
    void Insert(List<String> companyData) {
        sql.Run(DBCompanyEnum.INSERT.getQuery(),companyData)
    }

    @Override
    void Insert(Company company) {
        List<String> companyData = company.toList()
        companyData.removeAt(companyData.size()-1)

        sql.Run(DBCompanyEnum.INSERT.getQuery(),companyData)
    }

    @Override
    List<List<String>> Select() {
        sql.Select(DBCompanyEnum.SELECT.getQuery())
    }

    @Override
    List<List<String>> SelectUsingEmail(String email) {
        sql.Select(DBCompanyEnum.SELECT_USING_EMAIL.getQuery(),[email])
    }
}
