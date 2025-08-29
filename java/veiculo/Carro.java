package veiculo;

import android.util.Log;

public class Carro extends Veiculo {
    private String tipo; // Combustível (C) ou Elétrico (E)
    private double ipva;

    public Carro(String numeroPlaca, String fabricante, String tipo) {
        super(numeroPlaca, fabricante);
        this.tipo = tipo;
    }

    @Override
    public void calcularIPVA() {
        if (tipo.equalsIgnoreCase("C")) {
            this.ipva = 1000.0;
        } else {
            this.ipva = 0.0;
        }
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Veiculo", "Carro - Placa: " + numeroPlaca +
                " | Fabricante: " + fabricante +
                " | Tipo: " + (tipo.equals("C") ? "Combustível" : "Elétrico") +
                " | Valor do IPVA: " + ipva);
    }
}


