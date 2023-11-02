package LinkeTinderAplication.app.Controller

import LinkeTinderAplication.app.Controller.Interface.ICompanyController
import LinkeTinderAplication.app.Model.Company
import LinkeTinderAplication.app.Service.CompanyService

class CompanyController implements ICompanyController{

    CompanyService service = new CompanyService()

    @Override
    void addCompany(List<String> companyData) {
        Company company = new Company(companyData)
        service.addCompany(company)
    }

    @Override
    List<Company> getCompanys() {
        return service.getCompanys()
    }
}
