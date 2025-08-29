package investimento;

import android.util.Log;

public class Acao extends Investimento implements Avaliavel {
    private double precoMedio;
    private double precoAtual;
    private int quantidade;

    public Acao(String nome, double precoMedio, double precoAtual, int quantidade) {
        super(nome, precoMedio * quantidade);
        this.precoMedio = precoMedio;
        this.precoAtual = precoAtual;
        this.quantidade = quantidade;
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Investimento", "Ação - Nome: " + nome +
                " | Quantidade: " + quantidade +
                " | Preço Médio: R$" + precoMedio +
                " | Preço Atual: R$" + precoAtual);
    }

    @Override
    public double calcularRetorno() {
        return (precoAtual - precoMedio) * quantidade;
    }

    @Override
    public boolean precisaRevisao() {
        return quantidade <= 0 || precoAtual <= 0;
    }
}
