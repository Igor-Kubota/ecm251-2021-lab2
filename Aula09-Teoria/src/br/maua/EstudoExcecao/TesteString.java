package br.maua.EstudoExcecao;

import java.util.Locale;

public class TesteString {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println("Frase Antiga:" + frase);
        System.out.println("Frase Nova:" + novaFrase);
    }
}

