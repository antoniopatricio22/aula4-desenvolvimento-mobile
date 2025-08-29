package com.example.myapplication;

import android.util.Log;

public class SMS implements Notificacao {
    private String numeroTelefone;

    public SMS(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviarmensagem(String mensagem) {
        Log.i("Notificacao", "enviando SMS para" + numeroTelefone+ ":" + mensagem);
    }
}
