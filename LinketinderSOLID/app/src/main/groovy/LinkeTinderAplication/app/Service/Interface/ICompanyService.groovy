package LinkeTinderAplication.app.Service.Interface

import LinkeTinderAplication.app.Model.Company

interface ICompanyService {
    void addCompany(Company company)
    List<Company> getCompanys()
}