/*

    Igor Eiki Ferreira Kubota
    RA: 19.02466-5

*/


package Kubota.Ferreira.Eiki.Igor;

import java.util.Random;

public class Transacoes {

    //Metodos
    //Gera um numero int aleatorio dentro do range a ser estabelecido
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    //Cria a String Qrcode com o id da conta, o nome, o valor cobrado, e uma chave aleatoria
    public static String GerarQrcode(int idConta, String nome, double valor) {
        String Qrcode = (idConta + ";" + nome + ";" + valor + ";" + getRandomNumberInRange(1000,9000));
        return Qrcode;
    }

    //  Recebe o Valor a ser cobrado atraves do Qrcode formado pelo GerarQrcode, Verifica se
    //  a transação pode ser feita e caso sim a realiza utilizando dos metodos criados na
    //  Classe Conta; caso contrário informa a falha na transação.
    public static boolean PagarRequisito(Usuario pagador, Usuario Receptor, String Qrcode){

        //  Divide OQrcode formado pelo caractére ';' e transforma o indice valor
        //  que está em String para um double.
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