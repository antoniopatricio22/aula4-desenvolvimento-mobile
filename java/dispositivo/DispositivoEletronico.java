package dispositivo;

import android.util.Log;

public abstract class DispositivoEletronico {
    protected String nome;
    protected boolean ligado;

    public DispositivoEletronico(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        Log.i("Dispositivo", nome + " foi ligado.");
    }

    public void desligar() {
        ligado = false;
        Log.i("Dispositivo", nome + " foi desligado.");
    }

    public abstract void conectarInternet();

    public abstract int velocidadeConexaoMbps();
}
