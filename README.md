# TODO LIST (LISTA DE TAREFAS)

## Endpoints
- BaseURL: http://localhost:8080/todos
- POST: criar(Todo)
- GET: listar()
- PUT: alterar(Todo)
- DELETE /{id}: deletar(id)

### criar(Todo) - BaseURL
enviar
```json
{
  "nome": "Academia",
  "descricao": "Academia as 22 horas",
  "realizado": false,
  "prioridade": 2
}
```
retornar
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
enviar
```json
{
  "nome": "Estudar",
  "descricao": "Estudar as 19 horas",
  "realizado": false,
  "prioridade": 1
}
```
retornar
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

### listar() - BaseURL
retornar
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

### alterar(Todo) - BaseURL
enviar
```json
{
  "id": 1,
  "nome": "Academia",
  "descricao": "Academia as 22 horas",
  "realizado": true,
  "prioridade": 2
}
```
retornar
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

### deletar(id) - BaseURL/1
retornar
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

## Business Rules (regras de negócio)
- Ao criar a tarefa, deve retornar todas as tarefas;
- Ao listar as tarefas a prioridade deve ser decrescente e o nome crescente;
- Ao alterar a tarefa, deve retornar todas as tarefas;
- Ao deletar a tarefa, deve retornar todas as tarefas;
