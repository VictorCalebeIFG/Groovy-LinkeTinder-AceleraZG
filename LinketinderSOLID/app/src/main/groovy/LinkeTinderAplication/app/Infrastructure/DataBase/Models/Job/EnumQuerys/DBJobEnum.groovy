package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Job.EnumQuerys

enum DBJobEnum {
    INSERT_USING_EMAIL("""
        INSERT INTO VAGA(EMPRESA_ID,NOME,DESCRICAO,LOCAL)
        VALUES( (SELECT ID FROM EMPRESA WHERE EMAIL = (?) ) ,(?),(?),(?) )
        """
    ),
    LINK_SKILL_USING_EMAIL("""
        INSERT INTO COMPETENCIA_VAGA (ID_VAGA,ID_COMPETENCIA)
        VALUES (CAST(? AS INTEGER), CAST(? AS INTEGER))"""
    ),
    SELECT_USING_EMAIL("""
        Select * from vaga
        where empresa_id = (select id from empresa where email = ?);"""
    )

    final String query

    DBJobEnum(String query){
        this.query = query
    }

    String getQuery(){
        return query
    }
}