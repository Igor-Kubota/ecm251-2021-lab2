package Kubota.Ferreira.Eiki.Igor;

public class Conta {
    //atributos
    private Cliente cliente;
    private int Numero;
    private double Saldo;

    //metodos


    public Conta(String cliente, int numero, double saldo) {
        this.cliente = new Cliente(cliente);
        this.Numero = numero;
        this.Saldo = saldo;
    }

    public double getSaldo(){
        return this.Saldo;
    }

    public boolean Sacar(double valor){
        if(this.Saldo >=valor){
            this.Saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
   //     this.Saldo = this.Saldo + valor;
        this.Saldo += valor;
    }

    public boolean TransferirDinheiro(Conta destino, double valor){
        if(this.Sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", Numero=" + Numero +
                ", Saldo=" + Saldo +
                '}';
    }
}
