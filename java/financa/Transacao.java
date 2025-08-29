package financa;

import android.util.Log;

public abstract class Transacao {
    protected String descricao;
    protected double valor; // positivo para receita, negativo para despesa

    public Transacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract void exibirDetalhes();
    public abstract boolean validar();
}

