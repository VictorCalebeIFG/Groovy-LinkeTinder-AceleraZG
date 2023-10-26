package LinkeTinderAplication.app.Domain.Models

class Candidate {

    private String          name, lastName, birthDate
    private String          email, cpf, country
    private String          cep, description , password
    private List<String>    skills

    Candidate(String name, String lastName, String birthDate, String email, String cpf, String country, String cep, String description, String password, List skills) {
        this.name = name
        this.lastName = lastName
        this.birthDate = birthDate
        this.email = email
        this.cpf = cpf
        this.country = country
        this.cep = cep
        this.description = description
        this.password = password
        this.skills = skills
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

}
