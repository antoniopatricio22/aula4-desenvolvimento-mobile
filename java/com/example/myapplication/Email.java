package com.example.myapplication;

import android.util.Log;

public class Email implements Notificacao{
    private String enderecoEmail;

    public Email(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    @Override
    public void enviarmensagem(String mensagem) {
        Log.i("Notificacao", "enviando email para" + enderecoEmail+ ":" + mensagem);
    }
}
