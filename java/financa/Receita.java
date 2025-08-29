package financa;

import android.util.Log;

public class Receita extends Transacao implements ComCategoria {
    private String categoria;

    public Receita(String descricao, double valor) {
        super(descricao, valor);
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Transacao", "Receita - Descrição: " + descricao +
                " | Valor: R$" + valor +
                " | Categoria: " + (categoria != null ? categoria : "Sem categoria"));
    }

    @Override
    public boolean validar() {
        return valor > 0;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }
}
