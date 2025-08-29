package contatos;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public class ContatoPessoal extends Contato implements TemRedeSocial {
    private Map<String, String> redesSociais = new HashMap<>();

    public ContatoPessoal(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Contato", "Contato Pessoal - Nome: " + nome + " | Telefone: " + telefone);
        exibirRedesSociais();
    }

    @Override
    public boolean validar() {
        return telefone != null && !telefone.isEmpty();
    }

    @Override
    public void adicionarRedeSocial(String rede, String usuario) {
        redesSociais.put(rede, usuario);
    }

    @Override
    public void exibirRedesSociais() {
        for (Map.Entry<String, String> entry : redesSociais.entrySet()) {
            Log.i("Contato", "Rede: " + entry.getKey() + " | Usuário: " + entry.getValue());
        }
    }
}
