package Kubota.Ferreira.Eiki.Igor;

public class Main {

    public static void main(String[] args) {
        //cria uma referencia aum objeto conta
        Conta c1;

        //instancia um objeto conta

        c1 = new Conta();
        c1.cliente = new Cliente();


        //manipular os atributos
        c1.cliente.Titular = "Igor";
        c1.Saldo = 199.99;
        c1.Numero = 1234;

        //invocar o metodo visualizar saldo
        c1.visualizarSaldo();

    //Depositar dinheiro
        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.Saldo = 400;
        c2.cliente.Titular = "Izuku Midoriya";
        c2.visualizarSaldo();

        c1.depositar(100);
        c1.visualizarSaldo();

    //Sacar dinheiro
        if (c2.Sacar(20)) {
            System.out.println("Deu Bom");
        } else {
            System.out.println("Deu Ruim");
        }
        c2.visualizarSaldo();

    //Transferir dinheiro
       if(c1.TransferirDinheiro(c2,500)){
           System.out.println("Transferencia Realizada com Sucesso");
       }else{
           System.out.println("Falha ao Transferir");
       }

       c1.visualizarSaldo();
       c2.visualizarSaldo();

       System.out.println("c1:" + c1.toString());
       System.out.println("c2:" + c2.toString());


    }
}