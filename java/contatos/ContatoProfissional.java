package contatos;

import android.util.Log;

public class ContatoProfissional extends Contato implements TemEmpresa {
    private String email;
    private String empresa;

    public ContatoProfissional(String nome, String telefone, String email) {
        super(nome, telefone);
        this.email = email;
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Contato", "Contato Profissional - Nome: " + nome +
                " | Telefone: " + telefone +
                " | Email: " + email +
                " | Empresa: " + (empresa != null ? empresa : "Não informado"));
    }

    @Override
    public boolean validar() {
        return email != null && email.contains("@");
    }

    @Override
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getEmpresa() {
        return empresa;
    }
}
