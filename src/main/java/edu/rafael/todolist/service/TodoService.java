package edu.rafael.todolist.service;

import edu.rafael.todolist.model.Todo;
import edu.rafael.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> criarTodo(Todo todo){
        todoRepository.save(todo);
        return listarTodos();
    }

    public List<Todo> listarTodos(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> alterarTodo(Todo todo){
        todoRepository.save(todo);
        return listarTodos();
    }

    public List<Todo> deletarTodo(Long id){
        todoRepository.deleteById(id);
        return listarTodos();
    }
}
