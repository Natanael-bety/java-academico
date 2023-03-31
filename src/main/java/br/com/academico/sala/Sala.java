package br.com.academico.sala;
public class Sala {
    private int id;
    private int numero;
    private int cpAlunos;
    private boolean arCondicionado;
    private boolean quadroBranco;
    private boolean laboratorio;
    


    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }


    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }




    public int getCpAlunos() {
        return cpAlunos;
    }




    public void setCpAlunos(int cpAlunos) {
        this.cpAlunos = cpAlunos;
    }




    public boolean isArCondicionado() {
        return arCondicionado;
    }




    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }




    public boolean isQuadroBranco() {
        return quadroBranco;
    }




    public void setQuadroBranco(boolean quadroBranco) {
        this.quadroBranco = quadroBranco;
    }




    public boolean isLaboratorio() {
        return laboratorio;
    }




    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }




    public Sala() {
    }




    public Sala(int numero, int cpAlunos, boolean arCondicionado, boolean quadroBranco, boolean laboratorio) {
        this.numero = numero;
        this.cpAlunos = cpAlunos;
        this.arCondicionado = arCondicionado;
        this.quadroBranco = quadroBranco;
        this.laboratorio = laboratorio;
    }




    @Override
    public String toString() {
        return "sala [arCondicionado=" + arCondicionado + ", cpAlunos=" + cpAlunos + ", laboratorio=" + laboratorio
                + ", numero=" + numero + ", quadroBranco=" + quadroBranco + "]";
    }




    public void add(Sala sala) {
    }

    
    
}
