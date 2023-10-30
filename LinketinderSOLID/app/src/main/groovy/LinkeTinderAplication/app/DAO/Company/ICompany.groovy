package LinkeTinderAplication.app.DAO.Company

import LinkeTinderAplication.app.Domain.Models.Company

interface ICompany {
    void DeleteUsingEmail(String email)
    void Insert(List<String> companyData)
    void Insert(Company company)
    List<List<String>> Select()
    List<List<String>> SelectUsingEmail(String email)
}