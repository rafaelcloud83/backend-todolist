# TO-DO LIST (LISTA DE TAREFAS)

Repositório de um projeto To-do List ou Lista de tarefas.

## Sumário

* [Business Rules](#business-rules)
* [Tecnologias e Ferramentas utilizadas](#tecnologias-e-ferramentas-utilizadas)
* [Execução do projeto](#execução-do-projeto)
* [Acessando a aplicação](#acessando-a-aplicação)
* [Endpoints](#endpoints)
    * [Criar To-do](#criar-to-do)
    * [Listar To-do](#listar-to-do)
    * [Alterar To-do](#alterar-to-do)
    * [Deletar To-do](#deletar-to-do)

## Business Rules

Regras de Negócio:
- Ao criar a tarefa, deve retornar todas as tarefas;
- Ao listar as tarefas a prioridade deve ser decrescente e o nome crescente;
- Ao alterar a tarefa, deve retornar todas as tarefas;
- Ao deletar a tarefa, deve retornar todas as tarefas;

## Tecnologias e Ferramentas utilizadas

* **Java 17**
* **Spring Boot 3**
* **API REST**
* **IntelliJ IDEA Community Edition**
* **Maven**

## Execução do projeto

Para rodar a aplicação, será necessário ter instalado:

* **Java 17**
* **Maven 3.9.0 ou superior**

## Executando manualmente via CLI

Primeiramente clone o projeto com o comando:

- Clonar com SSH

`git clone git@github.com:rafaelcloud83/backend-todolist.git`

- OU Clonar com HTTPS

`git clone https://github.com/rafaelcloud83/backend-todolist.git`

Antes da execução do projeto, realize o `build` da aplicação indo no diretório raiz e executando o comando:

`mvn clean package`

Para executar o projeto com Maven, basta entrar no diretório raiz do projeto, e executar o comando:

`mvn spring-boot:run`

## Acessando a aplicação

Para acessar a aplicação, basta acessar a URL(BaseURL):

http://localhost:8080/todos

Para acessar o banco H2 em memória:

http://localhost:8080/h2-console

## Endpoints

### Criar To-do

**POST** http://localhost:8080/todos

- Criando a primeira To-do:

Payload:

```json
{
  "nome": "Academia",
  "descricao": "Academia as 22 horas",
  "realizado": false,
  "prioridade": 2
}
```

Resposta:

```json
[
  {
    "id": 1,
    "nome": "Academia",
    "descricao": "Academia as 22 horas",
    "realizado": false,
    "prioridade": 2
  }
]
```

- Criando a segunda To-do:

Payload:

```json
{
  "nome": "Estudar",
  "descricao": "Estudar as 19 horas",
  "realizado": false,
  "prioridade": 1
}
```

Resposta:

```json
[
  {
    "id": 1,
    "nome": "Academia",
    "descricao": "Academia as 22 horas",
    "realizado": false,
    "prioridade": 2
  },
  {
    "id": 2,
    "nome": "Estudar",
    "descricao": "Estudar as 19 horas",
    "realizado": false,
    "prioridade": 1
  }
]
```

### Listar To-do

**GET** http://localhost:8080/todos

Resposta:

```json
[
  {
    "id": 1,
    "nome": "Academia",
    "descricao": "Academia as 22 horas",
    "realizado": false,
    "prioridade": 2
  },
  {
    "id": 2,
    "nome": "Estudar",
    "descricao": "Estudar as 19 horas",
    "realizado": false,
    "prioridade": 1
  }
]
```

### Alterar To-do

**PUT** http://localhost:8080/todos

Payload:

```json
{
  "id": 1,
  "nome": "Academia",
  "descricao": "Academia as 22 horas",
  "realizado": true,
  "prioridade": 2
}
```

Resposta:

```json
[
  {
    "id": 1,
    "nome": "Academia",
    "descricao": "Academia as 22 horas",
    "realizado": true,
    "prioridade": 2
  },
  {
    "id": 2,
    "nome": "Estudar",
    "descricao": "Estudar as 19 horas",
    "realizado": false,
    "prioridade": 1
  }
]
```

### Deletar To-do

**DELETE** http://localhost:8080/todos/1

Resposta:

```json
[
  {
    "id": 2,
    "nome": "Estudar",
    "descricao": "Estudar as 19 horas",
    "realizado": false,
    "prioridade": 1
  }
]
```