package LinkeTinderAplication.app.Model

class Company {
    private String ID
    private String name
    private String cnpj
    private String email
    private String description
    private String country
    private String cep
    private String password

    private List<Job>   jobs

    Company(String name, String cnpj, String email, String description, String country, String cep, String password, List jobs) {
        this.name =         name
        this.cnpj =         cnpj
        this.email =        email
        this.description =  description
        this.country =      country
        this.cep =          cep
        this.password =     password
        this.jobs =         jobs
    }

    Company(List<String> data){
        this.ID =           data[0]
        this.name =         data[1]
        this.cnpj =         data[2]
        this.email =        data[3]
        this.description =  data[4]
        this.country =      data[5]
        this.cep =          data[6]
        this.password =     data[7]
    }

    Company(){
    }

    List<String> toList(){
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


    @Override
    public String toString() {
        return "Company{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", country='" + country + '\'' +
                ", cep='" + cep + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
