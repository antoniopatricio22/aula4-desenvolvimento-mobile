package investimento;

import android.util.Log;

public abstract class Investimento {
    protected String nome;
    protected double aporte; // valor investido

    public Investimento(String nome, double aporte) {
        this.nome = nome;
        this.aporte = aporte;
    }

    public abstract void exibirDetalhes();
    public abstract double calcularRetorno();
}
