package edu.rafael.todolist.controller;

import edu.rafael.todolist.model.Todo;
import edu.rafael.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<List<Todo>> criar(@RequestBody Todo todo){
        List<Todo> lista = todoService.criarTodo(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(lista);
    }

    @GetMapping
    public ResponseEntity<List<Todo>> listar(){
        List<Todo> lista = todoService.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PutMapping
    public ResponseEntity<List<Todo>> alterar(@RequestBody Todo todo){
        List<Todo> lista = todoService.alterarTodo(todo);
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Todo>> deletar(@PathVariable Long id){
        List<Todo> lista = todoService.deletarTodo(id);
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
}
