package br.maua.EstudoExcecao;

import java.util.Locale;

public class TesteString {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException exception){
            System.out.println("Uma Excecao ocorreu: "+ exception.getMessage());
            frase = "";
            novaFrase = "";

        }

        System.out.println("Frase Antiga:" + frase);
        System.out.println("Frase Nova:" + novaFrase);
    }
}

