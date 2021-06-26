package Kubota.Ferreira.Eiki.Igor.Controle;

import Kubota.Ferreira.Eiki.Igor.Enums.Horarios;

import java.util.Scanner;

public class Sistema {
    final private static Scanner scanner = new Scanner(System.in);
    private static Horarios HoraAtual = Horarios.REGULAR;

    public static void run() {
        boolean running = true;


        while(running){
        System.out.println("******* Bem Vindo ao Mask_Society *******\n");
        System.out.println(

                "--------MENU DE OPÇÕES--------\n" +
                "HORARIO ATUAL: " + HoraAtual + "\n" +
                "1 - Cadastrar um novo Membro:\n"+
                "2 - Postar mensagem\n" +
                "3 - Trocar o horário de trabalho\n" +
                "4 - Encerrar o Sistema\n"+
                "Digite a sua Opção: "
        );
        int input = scanner.nextInt();
        switch (input){
            case 1 :
                System.out.println("bom dia\n");
                break;

            case 3:
                if(HoraAtual == Horarios.REGULAR) {
                    HoraAtual = Horarios.EXTRA;
                }
                else {
                    HoraAtual = Horarios.REGULAR;
                }
                break;

            case 4:
                System.out.println("Encerrando Sistema");
                running = false;
                break;

            default:
                break;

            }
        }
    }
}
