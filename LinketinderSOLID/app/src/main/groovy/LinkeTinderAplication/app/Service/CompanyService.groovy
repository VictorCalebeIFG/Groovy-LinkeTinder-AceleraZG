package LinkeTinderAplication.app.Service

import LinkeTinderAplication.app.DAO.Company.CompanyDAO
import LinkeTinderAplication.app.Model.Company
import LinkeTinderAplication.app.Service.Interface.ICompanyService

class CompanyService implements ICompanyService{
    @Override
    void addCompany(Company company) {
        CompanyDAO dao = new CompanyDAO()
        dao.Insert(company)
    }

    @Override
    List<Company> getCompanys() {
        CompanyDAO dao = new CompanyDAO()
        return dao.Select().collect(){new Company(it)}
    }
}
