
// Igor Eiki Ferreira Kubota
// RA: 19.02466-5


package Kubota.Ferreira.Eiki.Igor;

import java.util.Random;


public class Transacoes {

    //Gera um numero int aleatorio
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private static String GerarQrcode(int idConta,String nome, double valor) {
        String Qrcode = (idConta + ";" + nome + ";" + valor + ";" + getRandomNumberInRange(1000,9000));
        return Qrcode;

    }
}