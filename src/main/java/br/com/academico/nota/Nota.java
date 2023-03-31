package br.com.academico.nota;
public class Nota {
    private double valor;
    private int peso;

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Nota() {
    }
    
    public Nota(double valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Nota [peso=" + peso + ", valor=" + valor + "]";
    }

    
}
