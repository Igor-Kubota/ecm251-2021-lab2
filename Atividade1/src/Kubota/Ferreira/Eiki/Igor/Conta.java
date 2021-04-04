
// Igor Eiki Ferreira Kubota
// RA: 19.02466-5


package Kubota.Ferreira.Eiki.Igor;

public class Conta {
    private int idConta;
    private double saldo;
    private int nConta;

    //Construtor
    public Conta(double saldo) {
        nConta += 1;
        this.idConta = nConta;

        this.saldo = saldo;
    }

    //Getters
    public int getIdConta(){
    return this.idConta;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
