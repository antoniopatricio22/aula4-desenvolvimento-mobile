package financa;

import android.util.Log;

public class Despesa extends Transacao implements ComCategoria {
    private String categoria;

    public Despesa(String descricao, double valor) {
        super(descricao, valor);
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Transacao", "Despesa - Descrição: " + descricao +
                " | Valor: R$" + valor +
                " | Categoria: " + (categoria != null ? categoria : "Sem categoria"));
    }

    @Override
    public boolean validar() {
        return valor < 0; // despesa deve ser negativa
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
