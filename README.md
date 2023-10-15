# Groovy-LinkeTinder-AceleraZG

[Link no Trello](https://trello.com/b/bvsAxaEG/linketinder)


[Link do GoogleSheets](https://docs.google.com/spreadsheets/d/1GkHN5wSEZgmY-ZBkXTdNZV9Sle0mTweC4Cvh6Kv4pyY/edit#gid=0)

### Explicação:

No momento, a aplicação foi dividida em três partes principais: **Aplication,Domain,Infrastructure.**

Isso foi feito para facilitar a aplicação da metodologia **SOLID**.

#### Aplication:
<img width="230" alt="image" src="https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/b67eef15-ede2-4dcf-b168-1ea52cb2b623">

 Dessa forma, na camada de **Aplicação**, foram colocados os elementos necessários para o funcionamento do programa, nela estão as interações com o usuário final, como por exemplo o "Switch Case" que decide o que cada comando faz dentro da aplicação. Aqui está a estrutura da camada de aplicação:

<img width="167" alt="image" src="https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/643e0214-3d77-46e7-8d31-5d0b0ac147b7">

A **Engine** nada mais é do que o "motor" da aplicação, é nela que está o looping e a camada de **controle**.

<img width="171" alt="image" src="https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/0fdc2c5b-285a-410b-ad30-d24063b86268">

Dentro da camada de **Controle** temos os elementos que interagem com o Banco de Dados (**Camada de Insfraestrutura**). 

<img width="159" alt="image" src="https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/c8bf8a27-e36d-4194-8fba-8332b1bc71bb">

Além disso temos camada de interação com o usuário, responsável por mostrar os comandos e receber os inputs via terminal:

<img width="133" alt="image" src="https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/ec73ab2b-6ec1-4abe-bee4-a476bc4cdf9e">

#### Domain:

É nessa camada que estão os elementos responsáveis pelas regras de negócio: É nela que está a camada de MODELO da arquitetura **MVC**.

<img width="160" alt="image" src="https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/8b08247d-c4ea-4dba-a6e7-1670c8dd514a">

#### Infrastructure:

Essa é a camada resonsável por "conversar" diretamente com o banco.

<img width="155" alt="image" src="https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/8fb3c809-9648-4871-8f4a-57b9c44f371d">

### Aplicação do SOLID:

De forma geral, as alterações ,em sua maioria, foram em relação granularidade dos métodos. Cada função faz no máximo **uma coisa**. Além disso apliquei o "dont repeat your self" através da utilização de herença no banco de dados, removendo a necessidade de passar as credenciais do banco a todo momento.

---
# Banco de Dados

**Modelo Entidade Relacionamento:**

![Linketinder_diagrama_entindade_relacionamento](https://github.com/VictorCalebeIFG/Groovy-LinkeTinder-AceleraZG/assets/84258178/3b6b510b-a84e-43e9-a235-50e745050559)
