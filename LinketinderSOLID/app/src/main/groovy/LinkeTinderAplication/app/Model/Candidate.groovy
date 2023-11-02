package LinkeTinderAplication.app.Model

class Candidate {
    private String ID
    private String name
    private String lastName
    private String birthDate
    private String email
    private String cpf
    private String country
    private String cep
    private String description
    private String password
    private List<String>    skills

    Candidate(String name, String lastName, String birthDate, String email, String cpf, String country, String cep, String description, String password, List skills) {
        this.name =         name
        this.lastName =     lastName
        this.birthDate =    birthDate
        this.email =        email
        this.cpf =          cpf
        this.country =      country
        this.cep =          cep
        this.description =  description
        this.password =     password
        this.skills =       skills
    }

    Candidate(List<String> data){
        this.ID =           data[0]
        this.name =         data[1]
        this.lastName =     data[2]
        this.birthDate =    data[3]
        this.email =        data[4]
        this.cpf =          data[5]
        this.country =      data[6]
        this.cep =          data[7]
        this.description =  data[8]
        this.password =     data[9]
    }

    Candidate(){
    }

    List<String> toList(){
        return [name,lastName,birthDate,email,cpf,country,cep,description,password,skills]
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    String getBirthDate() {
        return birthDate
    }

    void setBirthDate(String birthDate) {
        this.birthDate = birthDate
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getCpf() {
        return cpf
    }

    void setCpf(String cpf) {
        this.cpf = cpf
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

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }


    @Override
    public String toString() {
        return "Candidate{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", country='" + country + '\'' +
                ", cep='" + cep + '\'' +
                ", description='" + description + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
