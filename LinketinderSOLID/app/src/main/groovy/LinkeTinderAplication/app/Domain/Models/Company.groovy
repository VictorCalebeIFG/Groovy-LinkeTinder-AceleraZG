package LinkeTinderAplication.app.Domain.Models

class Company {

    private String      name, cnpj, email, description
    private String      country, cep, password
    private List<Job>   jobs

    Company(String name, String cnpj, String email, String description, String country, String cep, String password, List jobs) {
        this.name = name
        this.cnpj = cnpj
        this.email = email
        this.description = description
        this.country = country
        this.cep = cep
        this.password = password
        this.jobs = jobs
    }

    Company(){
    }

    List toList(){
        return [this.name, this.cnpj, this.email , this.description, this.country, this.cep, this.password, this.jobs]
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getCnpj() {
        return cnpj
    }

    void setCnpj(String cnpj) {
        this.cnpj = cnpj
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String getCountry() {
        return country
    }

    void setCountry(String country) {
        this.country = country
    }

    String getCep() {
        return cep
    }

    void setCep(String cep) {
        this.cep = cep
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    List getJobs() {
        return jobs
    }

    void setJobs(List jobs) {
        this.jobs = jobs
    }
}
