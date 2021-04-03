// Igor Eiki Ferreira Kubota
// RA: 19.02466-5


package Kubota.Ferreira.Eiki.Igor;

public class Conta {
    private int idConta;
    private double saldo;


    //Construtor
    public Conta(int idConta, double saldo) {
        this.idConta = idConta;
        this.saldo = saldo;
    }

    //Getters
    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
