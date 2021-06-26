package Kubota.Ferreira.Eiki.Igor.Controle;

import java.util.Scanner;

public class Sistema {
    public static void run() {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n******* Bem Vindo ao Mask_Society *******\n"+
            "Escolha uma atividade:\n" +
            "1 - Cadastrar um novo Membro:\n"+
            "2 - Postar mensagem\n" +
            "3 - Trocar o horário de trabalho\n" +
            "4 - Encerrar o Sistema\n");

        }while(input.nextLine() != "4");
    }
}
