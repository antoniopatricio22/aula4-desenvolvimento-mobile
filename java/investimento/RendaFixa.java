package investimento;

import android.util.Log;

public class RendaFixa extends Investimento implements Avaliavel {
    private double taxaAnual; // exemplo: 0.10 = 10% a.a.

    public RendaFixa(String nome, double aporte, double taxaAnual) {
        super(nome, aporte);
        this.taxaAnual = taxaAnual;
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Investimento", "Renda Fixa - Nome: " + nome +
                " | Aporte: R$" + aporte +
                " | Taxa Anual: " + (taxaAnual * 100) + "%");
    }

    @Override
    public double calcularRetorno() {
        return aporte * taxaAnual; // simplificado
    }

    @Override
    public boolean precisaRevisao() {
        return taxaAnual <= 0;
    }
}
