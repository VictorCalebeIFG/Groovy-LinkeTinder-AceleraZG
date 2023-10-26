package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.EnumQuerys

enum DBCandidateEnum {

    DELETE_USING_EMAIL("""
    Delete From Candidato Where email = ? 
    """),

    INSERT("""
    Insert Into Candidato (NOME, SOBRE_NOME, DATA_NASCIMENTO, EMAIL, CPF, PAIS, CEP, DESC_PESSOAL, SENHA)
    Values (?, ?, ?, ?, ?, ?, ?, ?, ?)  """),

    SELECT("""
    Select * from Candidato
    """),

    SELECT_USING_EMAIL("""
    Select * from Candidato where email = ?
    """),

    LINK_SKILL_USING_EMAI("""
    insert into competencia_candidato (id_candidato,id_competencia)
    values ( (select id from candidato where email= (?) ), CAST( (?) AS INTEGER) );
    """)

    final String query

    DBCandidateEnum(String query){
        this.query = query
    }

    String getQuery(){
        return query
    }
}