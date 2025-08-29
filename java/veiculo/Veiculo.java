package veiculo;

import android.util.Log;

public abstract class Veiculo {
    protected String numeroPlaca;
    protected String fabricante;

    public Veiculo(String numeroPlaca, String fabricante) {
        this.numeroPlaca = numeroPlaca;
        this.fabricante = fabricante;
    }

    public abstract void calcularIPVA();

    public void exibirDetalhes() {
        Log.i("Veiculo", "Numero da Placa:"+ numeroPlaca + "Fabricante:" + fabricante);
    }
}
