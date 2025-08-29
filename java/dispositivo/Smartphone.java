package dispositivo;

import android.util.Log;

public class Smartphone extends DispositivoEletronico {
    private String rede; // "Wi-Fi" ou "4G" ou "5G"

    public Smartphone(String nome, String rede) {
        super(nome);
        this.rede = rede;
    }

    @Override
    public void conectarInternet() {
        Log.i("Dispositivo", nome + " conectado à internet via " + rede + ".");
    }

    @Override
    public int velocidadeConexaoMbps() {
        switch (rede) {
            case "Wi-Fi": return 100;
            case "5G": return 300;
            case "4G": return 50;
            default: return 10;
        }
    }
}
