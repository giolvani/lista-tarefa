package br.edu.ifpr.task_manager.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Task {

    private Long id;
    private String titulo;
    private String descricao;
    private TaskStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate data;

    public Task(Long id, String titulo, String descricao, LocalDate data) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.status = TaskStatus.EM_ANDAMENTO;
    }

    public Task() {
        this.status = TaskStatus.EM_ANDAMENTO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
