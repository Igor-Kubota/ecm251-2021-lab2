package Kubota.Ferreira.Eiki.Igor;

import java.util.Scanner;

public class Sistema {
    private boolean executarsistema;
    private Scanner scanner;


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
            default:
                System.out.println("Opção ainda nao implementada");
                break;




        }
    }

    public Sistema(){
        this.executarsistema = true;
        this.scanner = new Scanner(System.in);
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

