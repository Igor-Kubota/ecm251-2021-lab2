
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

    public static String GerarQrcode(int idConta, String nome, double valor) {
        String Qrcode = (idConta + ";" + nome + ";" + valor + ";" + getRandomNumberInRange(1000,9000));
        return Qrcode;
    }

    public static boolean PagarRequisito(Usuario pagador, Usuario Receptor, String Qrcode){

        String[] dados = Qrcode.split(";") ;
        double ValorDoPagador = Double.parseDouble(dados[2]);

        if (pagador.getConta().getSaldo() >= ValorDoPagador){

            pagador.getConta().Pagar(ValorDoPagador);
            Receptor.getConta().Receber(ValorDoPagador);
            System.out.println("Transação realizada com sucesso.");

        }else{
            System.out.println("Transação falhou: Saldo Insuficiente.");
        }

        return true;
    }




}