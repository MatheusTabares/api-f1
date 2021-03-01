# api-f1

Api de resultados de corridas de Fórmula 1

## Tecnologias:
Java 11, Junit, Mockito, Spring Boot, Spring Security, JWT, JPA, MySQL.

Endpoint:
GET - http://localhost:8080/api/f1/{year}/last/results

Esse serviço é responsável por listar o resultado das corridas de fórmula 1, filtrando pelo ano informado ná variável do path.

Ex: http://localhost:8080/api/f1/2020/last/results

## Regras de negócio:
-A api possui segurança de autenticação e autorização para o endpoint disponibilizado. Desta forma para ter acesso ao endpoint mencionado a cima, somente realizando o login.

-Para realizar o login, basta enviar uma requisição para o endpoint descrito abaixo e no corpo da requisição informar os parâmetro '**email**' '**password**' :

-POST - http://localhost:8080/login

-BODY - `{
    "email": "apif1@icarros.com",
    "password": "icarros"
}`

-No cabeçalho do retorno da requisição com sucesso, será  informado o token JWT de autorização. O mesmo possui criptografia **HS512** e tempo de expiração de 1 minuto

-Com o token em mãos, o usuário terá acesso ao endpoint de listagem de corridas. Basta informar no cabeçalho da requisição o parâmetro '**Authorization**' com o valor '**Bearer {token}**'

-Foram criados testes automatizados para cobertura de testes.

-Foram criados tratamento de exceções personalizadas para melhor entendimento do usuário.

-Foi criado o banco de dados, denominado **F1** no MySQL. Script de criação está na pasta scripts na raiz do projeto.

-Foi criado a tabela **F1_RACE_RESULT** no bando de dados **F1**, responsável por manter as informações dos resultados das corridas. Scripts de criação e população da tabela estão na pasta scripts na raiz do projeto.

- 

- 

- 


Qualquer dúvida, estou a disposição

Matheus Tabares (48) 99836-2417
