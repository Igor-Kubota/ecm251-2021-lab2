package Kubota.Ferreira.Eiki.Igor;

import java.util.Scanner;

public class Sistema {
    private boolean executarsistema;
    private Scanner scanner;
    private Conta conta;


    public void executar(){
        int opcao;
        while(executarsistema) {
            exibirmenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);

        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por ter utilizado o Sistema");
                this.executarsistema = false;
                break;

            case 1:
                System.out.println("Saldo: R$ "+ this.conta.getSaldo() + "\n");
                break;

            case 2:
                System.out.println("Informe o valor para depositar: ");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Operação Realizada com Sucesso!\n");
                break;

            case 3:
                System.out.println("Informe o Valor para Sacar: ");
                double valorParaSacar = scanner.nextDouble();
                if(this.conta.Sacar(valorParaSacar)){
                    System.out.println("Operação realizada com sucesso!\n");
                } else{
                    System.out.println("Algo de Errado aconteceu: Saldo\n");
                }
                break;

            case 5:
                System.out.println("Nome do Titulo a pagar: ");
                String nomeTitulo = scanner.next();
                System.out.println("Valor do Titulo: ");
                double valorTitulo = scanner.nextDouble();
                System.out.println("Valor do juros por dia: ");
                double valorJurosPorDia = scanner.nextDouble();
                System.out.println("Informe a data de Vencimento (aaaa-mm-dd): ");
                String dataVencimentoTitulo = scanner.next();
                Titulo titulo = new Titulo(valorTitulo,nomeTitulo,valorJurosPorDia,dataVencimentoTitulo);
                if(this.conta.Sacar(titulo.getvalorPagamento())){
                    System.out.println("Operação Realizada com Sucesso!\n");
                }else{
                    System.out.println("Não foi possível realizar a Operação");
                }
                break;

            default:
                System.out.println("Opção ainda nao implementada\n");
                break;





        }
    }

    public Sistema(){
        this.executarsistema = true;
        this.scanner = new Scanner(System.in);  //Cria um scanner para o
                                                // teclado (entrada padrão)

        this.conta = new Conta("Luigi", 1235, 1000);

    }

    private void exibirmenu() {
        System.out.println("Bem vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar conta(Titulo)");
        System.out.println("0 - Encerrar sistema");


    }
}

