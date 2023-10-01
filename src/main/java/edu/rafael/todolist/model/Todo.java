package edu.rafael.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dascricao;
    private boolean realizado;
    private int prioridade;

    public Todo() {}

    public Todo(Long id, String nome, String dascricao, boolean realizado, int prioridade) {
        this.id = id;
        this.nome = nome;
        this.dascricao = dascricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }

    public Todo(String nome, String dascricao, boolean realizado, int prioridade) {
        this.nome = nome;
        this.dascricao = dascricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDascricao() {
        return dascricao;
    }

    public void setDascricao(String dascricao) {
        this.dascricao = dascricao;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return realizado == todo.realizado && prioridade == todo.prioridade && Objects.equals(id, todo.id) && Objects.equals(nome, todo.nome) && Objects.equals(dascricao, todo.dascricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dascricao, realizado, prioridade);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dascricao='" + dascricao + '\'' +
                ", realizado=" + realizado +
                ", prioridade=" + prioridade +
                '}';
    }
}
