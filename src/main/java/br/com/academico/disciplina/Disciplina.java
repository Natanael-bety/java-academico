package br.com.academico.disciplina;

import javax.validation.constraints.Pattern;

public class Disciplina {
    private int id;

    @Pattern(regexp="[0-9]{4}-[A-Z]*", message = "O atributo nome da disciplina é inválido.")

    private String nome;
    private int cgHoraria;
    private StatusDisciplina status;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCgHoraria() {
        return cgHoraria;
    }
    public void setCgHoraria(int cgHoraria) {
        this.cgHoraria = cgHoraria;
    }
    public StatusDisciplina getStatus() {
        return status;
    }

    public void setStatus(StatusDisciplina status) {
        this.status = status;
    }

    public Disciplina() {
    }

    public Disciplina(String nome, int cgHoraria) {
        this.nome = nome;
        this.cgHoraria = cgHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina [cgHoraria=" + cgHoraria + ", nome=" + nome + "]";
    }
    public Object fromString(String status) {
        return null;
    }

    
}
