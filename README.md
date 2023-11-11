# Groovy-LinkeTinder-AceleraZG

[Link no Trello](https://trello.com/b/bvsAxaEG/linketinder)


[Link do GoogleSheets](https://docs.google.com/spreadsheets/d/1GkHN5wSEZgmY-ZBkXTdNZV9Sle0mTweC4Cvh6Kv4pyY/edit#gid=0)

### Explicação:


### Aplicação do SOLID:

De forma geral, as alterações ,em sua maioria, foram em relação granularidade dos métodos. Cada função faz no máximo **uma coisa**. Além disso apliquei o "dont repeat your self" através da utilização de herença no banco de dados, removendo a necessidade de passar as credenciais do banco a todo momento.

### Aplicação de Padrões de projeto:

Foi aplicado o **singleton** no banco de dados, de forma que não fosse necessário iniciar o banco a cada requisição. Dessa forma, todas as instâncias do DAO utilizam a mesma instância de banco de dados.

Além disso, para cria a instância que executa os comandos SQL foi utilizado o padrão **Abstract Factory**, que permite criar instâncias SQL de forma mais isolada.

Outro padrão utilizado no banco de Dados foi o **Data Acces Object (DAO)**, que permitiu isolar as funcionalidades relacionadas a obtenção e gravação de dados.

### Aplicação do padrão MVC:

O projeto foi dividio em várias camadas:

**Aplicação**: onde está o Main e o Loop do terminal

**Controller**: É a camada que recebe as interações com a view. Essa camada receve inforamções da view e cria os objteos e os envia para camada service.

**Service**: A camada serice é responsável por receber as requesições da camada controller e envialas para os "DAO"

**View**: A camada view recebe o retorno da camada de controlle após uma operação usando os DAO's pela camada service e "renderiza" o retorno da camada de controle.

**Model**: A camada model é responsável pelos modelos de negócio, como candidato e compania.


### Criação da API:

Primeiramente foi feito a configuração do projeto: Coloquei uma pasta WebApp no projeto para conseguir inicar a aplicação pelo tomcat.
<img width="189" alt="image" src="https://github.com/VictorCalebeIFG/LinkeTinder/assets/84258178/e318ec2f-e6f6-4d2f-a32a-79518fe7303f">

Depois disso configurei o tomcat na IDE do **InteliJ Community** usando esse vídeo:
https://www.youtube.com/watch?v=iTzauISg5P4

#### **Cadastro de cliente usando o postman**

Aqui está um exemplo de Json para Cadastrar Candidato:
```json
{
  "ID": "1",
  "name": "John",
  "lastName": "Doe",
  "birthDate": "1990-01-01",
  "email": "john.doe@email.com",
  "cpf": "123456789",
  "country": "USA",
  "cep": "12345",
  "description": "Some description",
  "password": "password123"
}
```
<img width="600" alt="image" src="https://github.com/VictorCalebeIFG/LinkeTinder/assets/84258178/29a0be67-54ab-44ba-9420-39f34ae20c26">

#### **Cadastro de Empresa**

```json
{
  "ID": "1",
  "name": "CompanyName",
  "cnpj": "12345678901234",
  "email": "company@email.com",
  "description": "Company Description",
  "country": "Brazil",
  "cep": "12345-678",
  "password": "companyPassword123"
}
```
<img width="518" alt="image" src="https://github.com/VictorCalebeIFG/LinkeTinder/assets/84258178/e2239335-6aff-4de9-9274-888fe16bdff9">


#### **Ver Jobs por email**

`http://localhost:8080/app/Job?email=doritos@email.com`

<img width="379" alt="image" src="https://github.com/VictorCalebeIFG/LinkeTinder/assets/84258178/2f3e9910-e908-4cc0-ac8e-ac88ce1e8ec1">


---
# Banco de Dados

**Modelo Entidade Relacionamento:**

![Linketinder_diagrama_entindade_relacionamento](https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/3b6b510b-a84e-43e9-a235-50e745050559)
