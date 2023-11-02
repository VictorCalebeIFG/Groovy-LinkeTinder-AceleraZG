package LinkeTinderAplication.app.DAO.Company


import LinkeTinderAplication.app.DataBase.SQLFactory.SQLInstanceCreator
import LinkeTinderAplication.app.DataBase.SQLInstance
import LinkeTinderAplication.app.Model.Company

class CompanyDAO implements ICompany{

    private SQLInstance sql = new SQLInstanceCreator().createSQLInstance()

    @Override
    void DeleteUsingEmail(String email) {
        sql.Run(CompanyEnum.DELETE_USING_EMAIL.getQuery(),[email])
    }

    @Override
    void Insert(List<String> companyData) {
        sql.Run(CompanyEnum.INSERT.getQuery(),companyData)
    }

    @Override
    void Insert(Company company) {
        List<String> companyData = company.toList()
        companyData.removeAt(companyData.size()-1)

        sql.Run(CompanyEnum.INSERT.getQuery(),companyData)
    }

    @Override
    List<List<String>> Select() {
        sql.Select(CompanyEnum.SELECT.getQuery())
    }

    @Override
    List<List<String>> SelectUsingEmail(String email) {
        sql.Select(CompanyEnum.SELECT_USING_EMAIL.getQuery(),[email])
    }
}
