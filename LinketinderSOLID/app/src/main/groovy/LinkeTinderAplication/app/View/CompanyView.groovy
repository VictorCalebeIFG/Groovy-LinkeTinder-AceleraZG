package LinkeTinderAplication.app.View

import LinkeTinderAplication.app.Controller.CompanyController

class CompanyView {
    void addCompany(List<String> data){
        CompanyController controller = new CompanyController()
        controller.addCompany(data)
        println "Candidato adicionado"
    }

    void showCompanys(){
        CompanyController controller = new CompanyController()
        controller.getCompanys().forEach {println it.toString()}
    }
}
