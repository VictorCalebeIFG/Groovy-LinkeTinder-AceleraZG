package LinkeTinderAplication.app.Controller.Interface

import LinkeTinderAplication.app.Model.Company

interface ICompanyController {
    void addCompany(List<String> companyData)
    List<Company> getCompanys()
}