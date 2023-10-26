package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Company.DBCompanyInterface

import LinkeTinderAplication.app.Domain.Models.Company

interface DBCompanyInterface {
    void DeleteUsingEmail(String email)
    void Insert(List<String> companyData)
    void Insert(Company company)
    List<List<String>> Select()
    List<List<String>> SelectUsingEmail(String email)
}