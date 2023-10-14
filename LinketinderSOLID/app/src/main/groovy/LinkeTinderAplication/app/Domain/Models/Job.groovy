package LinkeTinderAplication.app.Domain.Models

class Job {
    private String nome, description
    private List<String> skills

    Job(String nome, String description, List<String> skills) {
        this.nome = nome
        this.description = description
        this.skills = skills
    }

    List<String> toList(){
        return [nome,description,skills]
    }
}
