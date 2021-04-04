/*

    Igor Eiki Ferreira Kubota
    RA: 19.02466-5

*/

package Kubota.Ferreira.Eiki.Igor;

public class Conta {
    private int idConta;
    private double saldo;
    private int nConta;
    private String qrcode;


    //Construtor
    //nConta indica o valor do id da conta.
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
    //Cria um QRCode vinculada à conta com um valor a ser definido.
    public void CriarQrCode(String nome, double valor){
        this.qrcode = Transacoes.GerarQrcode(this.idConta, nome, valor);
    }

    // Realiza o Pagamento com o valor informado.
    public void Pagar(double valor){
        this.saldo = this.saldo - valor;
    }

    // Realiza o Recebimento com o valor informado.
    public void Receber(double valor){
        this.saldo = this.saldo + valor;
    }

    //ToString Retorna informações da conta.
    @Override
    public String toString() {
        return "Conta{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", nConta=" + nConta +
                ", qrcode='" + qrcode + '\'' +
                '}';
    }
}

