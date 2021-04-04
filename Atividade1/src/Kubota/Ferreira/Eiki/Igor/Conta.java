
// Igor Eiki Ferreira Kubota
// RA: 19.02466-5


package Kubota.Ferreira.Eiki.Igor;

public class Conta {
    private int idConta;
    private double saldo;
    private int nConta;
    private String qrcode;


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

    public String getQrcode() {
        return this.qrcode;
    }


    //Metodos
    public void CriarQrCode(String nome, double valor){
        this.qrcode = Transacoes.GerarQrcode(this.idConta, nome, valor);
    }

    public void Pagar(double valor){
        this.saldo = this.saldo - valor;
    }
    public void Receber(double valor){
        this.saldo = this.saldo + valor;

    }
}

