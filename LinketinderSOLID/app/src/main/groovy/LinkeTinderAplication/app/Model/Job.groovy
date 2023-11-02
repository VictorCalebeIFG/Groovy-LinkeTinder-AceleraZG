package LinkeTinderAplication.app.Model

class Job {
    private String ID
    private String IdEmpresa
    private String nome
    private String description
    private String local
    private List<String>    skills

    Job(String nome, String description, List<String> skills) {
        this.nome = nome
        this.description = description
        this.skills = skills
    }
    Job(List<String> data){
        this.nome = data[0]
        this.description = data[1]
        this.local = data[2]
    }

    Job(){}

    static Job createJob(List<String> sqlData){
        Job job = new Job()
        job.setID(sqlData[0])
        job.setIdEmpresa(sqlData[1])
        job.setNome(sqlData[2])
        job.setDescription(sqlData[3])
        job.setLocal(sqlData[4])
        return  job
    }


    public List<String> toList(){
        return [nome,description,local,skills]
    }

    String getID() {
        return ID
    }

    void setID(String ID) {
        this.ID = ID
    }

    void setID(Integer ID) {
        this.ID = String.valueOf(ID)
    }

    String getIdEmpresa() {
        return IdEmpresa
    }

    void setIdEmpresa(String idEmpresa) {
        IdEmpresa = idEmpresa
    }

    void setIdEmpresa(Integer idEmpresa) {
        IdEmpresa = String.valueOf(idEmpresa)
    }

    String getNome() {
        return nome
    }

    void setNome(String nome) {
        this.nome = nome
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String getLocal() {
        return local
    }

    void setLocal(String local) {
        this.local = local
    }

    List<String> getSkills() {
        return skills
    }

    void setSkills(List<String> skills) {
        this.skills = skills
    }

    @Override
    public String toString() {
        return "Job{" +
                "ID='" + ID + '\'' +
                ", IdEmpresa='" + IdEmpresa + '\'' +
                ", nome='" + nome + '\'' +
                ", description='" + description + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
