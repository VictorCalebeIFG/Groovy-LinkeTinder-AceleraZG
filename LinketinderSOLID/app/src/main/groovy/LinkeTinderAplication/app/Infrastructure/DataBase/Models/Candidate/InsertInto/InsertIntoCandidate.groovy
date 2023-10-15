package LinkeTinderAplication.app.Infrastructure.DataBase.Models.Candidate.InsertInto


import LinkeTinderAplication.app.Infrastructure.DataBase.SuperClasses.InsertInto.InsertIntoDataBase

class InsertIntoCandidate extends InsertIntoDataBase{

    InsertIntoCandidate(){
        query = """
            Insert Into Candidato (NOME, SOBRE_NOME, DATA_NASCIMENTO, EMAIL, CPF, PAIS, CEP, DESC_PESSOAL, SENHA)
            Values (?, ?, ?, ?, ?, ?, ?, ?, ?)        
        """
    }

}
