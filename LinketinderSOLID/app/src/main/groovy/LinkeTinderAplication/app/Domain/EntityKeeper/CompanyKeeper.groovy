package LinkeTinderAplication.app.Domain.EntityKeeper

import LinkeTinderAplication.app.Domain.Models.Company
import LinkeTinderAplication.app.Domain.Utils.List.Models.removeUtils

class CompanyKeeper {
    private List<Company> companys = []

    public add(Company company){
        companys.add(company)
    }

    public removeUsingEmail(String email){
        removeUtils.removeUsingEmail(this.companys,email)
    }

    public List<Company> getCompanys() {
        return companys
    }

    public void setCompanys(List<Company> companys) {
        this.companys = companys
    }
}
