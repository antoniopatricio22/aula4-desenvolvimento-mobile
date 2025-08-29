package dispositivo;

import android.util.Log;

public class Computador extends DispositivoEletronico {
    private boolean caboEthernet;

    public Computador(String nome, boolean caboEthernet) {
        super(nome);
        this.caboEthernet = caboEthernet;
    }

    @Override
    public void conectarInternet() {
        if (caboEthernet) {
            Log.i("Dispositivo", nome + " conectado via cabo Ethernet.");
        } else {
            Log.i("Dispositivo", nome + " conectado via Wi-Fi.");
        }
    }

    @Override
    public int velocidadeConexaoMbps() {
        return caboEthernet ? 200 : 80;
    }
}
