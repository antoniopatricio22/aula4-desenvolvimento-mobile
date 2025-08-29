package veiculo;

import android.util.Log;

public class Caminhao extends Veiculo {
    private double capacidadeToneladas;
    private double ipva;

    public Caminhao(String numeroPlaca, String fabricante, double capacidadeToneladas) {
        super(numeroPlaca, fabricante);
        this.capacidadeToneladas = capacidadeToneladas;
    }

    @Override
    public void calcularIPVA() {

        if (capacidadeToneladas <= 3.5) {
            this.ipva = 1500.0;
        } else {
            this.ipva = 3000.0;
        }
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Veiculo", "Caminhão - Placa: " + numeroPlaca +
                " | Fabricante: " + fabricante +
                " | Capacidade: " + capacidadeToneladas + "t" +
                " | Valor do IPVA: " + ipva);
    }
}
