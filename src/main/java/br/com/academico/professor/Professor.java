package br.com.academico.professor;
import java.util.Random;

import br.com.academico.endereco.Endereco;
import br.com.academico.pessoa.Pessoa;

public class Professor extends Pessoa {

    private int id;
    private double salario;
    private float cgHorario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double d) {
        this.salario = d;
    }

    public float getCgHorario() {
        return cgHorario;
    }

    public void setCgHorario(float cgHorario) {
        this.cgHorario = cgHorario;
    }

    public Professor() {
        super();
        this.setMatricula(this.gerarMatricula());
    }

    public Professor(int salario, float cgHorario) {
        this.salario = salario;
        this.cgHorario = cgHorario;
    }

    public Professor(int matricula, String nome, String sobrenome, int idade, String naturalidade, String sexo, String cpf, Endereco endereco, double salario, float cgHorario) {
        super(matricula, nome, sobrenome, idade, naturalidade, sexo, cpf);
        this.salario = salario;
        this.cgHorario = cgHorario;
    }

    @Override
    public String toString() {
        String detalhes = "";
        detalhes += super.toString() + " \n";
        detalhes += "Curso: " + this.getSalario() + " \n";
        detalhes += "Esta matriculado? " + this.getCgHorario() + " \n";
        return detalhes;
    }

    @Override
    public int gerarMatricula() {
        Random gerador = new Random();
        int min = 10000000;
        int max = 99999999;
        return gerador.nextInt(max - min + 1) + min;
    }

    public void setCargaHoraria(int nextInt) {
    }

}
