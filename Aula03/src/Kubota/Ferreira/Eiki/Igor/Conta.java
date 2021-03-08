package Kubota.Ferreira.Eiki.Igor;

public class Conta {
    //atributos
    Cliente cliente;
    int Numero;
    double Saldo;

    //metodos
    void visualizarSaldo(){
        System.out.println("Valor do Saldo: R$"+ this.Saldo);
    }
    boolean Sacar(double valor){
        if(this.Saldo >=valor){
            this.Saldo -= valor;
            return true;
        }
        return false;
    }
    void depositar(double valor){
   //     this.Saldo = this.Saldo + valor;
        this.Saldo += valor;
    }
    boolean TransferirDinheiro(Conta destino, double valor){
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
