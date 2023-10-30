# Groovy-LinkeTinder-AceleraZG

[Link no Trello](https://trello.com/b/bvsAxaEG/linketinder)


[Link do GoogleSheets](https://docs.google.com/spreadsheets/d/1GkHN5wSEZgmY-ZBkXTdNZV9Sle0mTweC4Cvh6Kv4pyY/edit#gid=0)

### Explicação:


### Aplicação do SOLID:

De forma geral, as alterações ,em sua maioria, foram em relação granularidade dos métodos. Cada função faz no máximo **uma coisa**. Além disso apliquei o "dont repeat your self" através da utilização de herença no banco de dados, removendo a necessidade de passar as credenciais do banco a todo momento.

### Aplicação de Padrões de projeto:

Foi aplicado o singleton no banco de dados, de forma que não fosse necessário iniciar o banco a cada requisição. Dessa forma, todas as instâncias do DAO utilizam a mesma instância de banco de dados.

Além disso, para cria a instância que executa os comandos SQL foi utilizado o padrão Abstract Factory, que permite criar instâncias SQL de forma mais isolada.

---
# Banco de Dados

**Modelo Entidade Relacionamento:**

![Linketinder_diagrama_entindade_relacionamento](https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/3b6b510b-a84e-43e9-a235-50e745050559)
