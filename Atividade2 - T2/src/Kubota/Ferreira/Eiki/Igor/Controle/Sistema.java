package Kubota.Ferreira.Eiki.Igor.Controle;

import Kubota.Ferreira.Eiki.Igor.Enums.*;
import Kubota.Ferreira.Eiki.Igor.Models.*;

import java.io.IOException;
import java.util.Scanner;

public class Sistema{
    final private static Scanner scanner = new Scanner(System.in);

    final private static ControleLista lista = new ControleLista();
    private static Horarios HoraAtual = Horarios.REGULAR;


    public static void run() throws InterruptedException, IOException {
        boolean running = true;


        ControleLista.Limpa();

        while(running){
        System.out.println("******* Bem Vindo ao Mask_Society *******\n");
        System.out.println(

                "--------MENU DE OPÇÕES--------\n" +
                "HORARIO ATUAL: " + HoraAtual + "\n" +
                "1 - Cadastrar um novo Membro.\n"+
                "2 - Postar mensagem.\n" +
                "3 - Exibir Relatório de Informações.\n" +
                "4 - Remover um Membro.\n" +
                "5 - Verificar Horário\n"+
                "6 - Trocar o horário de trabalho.\n" +
                "7 - Encerrar o Sistema.\n"+
                "Digite a sua Opção: "
        );

        int input = scanner.nextInt();
        switch (input){
            case 1 :
                Cadastro cadastro = new Cadastro();

                Membro membro = cadastro.Listar();
                if (membro != null) {
                    lista.AddMembro(membro);
                    System.out.println("Membro Adicionado!");
                    lista.getListaDeMembros();
                }
                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;


            case 2:
                for(int i = 0;i<lista.getListaDeMembros().size();i++) {
                    System.out.println("MEMBRO " + i + " :");
                    lista.getListaDeMembros().get(i).Mensagem(HoraAtual);
                }
                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;


            case 3:
                for(int i = 0;i<lista.getListaDeMembros().size();i++){
                    System.out.println("MEMBRO "+ i + " :");
                    lista.getListaDeMembros().get(i).ExibirRelatorio();
                }

                System.out.println("\nPress Enter to Continue...");
                System.in.read();
                break;

            case 4:
                for(int i = 0;i<lista.getListaDeMembros().size();i++){
                    System.out.println("MEMBRO "+ i + " :");
                    lista.getListaDeMembros().get(i).ExibirRelatorio();
                }
                System.out.println("Escolha um Membro para Remover: ");

                int remove = scanner.nextInt();
                if(remove<lista.getListaDeMembros().size()) {
                    lista.RemoverMembro(lista.getListaDeMembros().get(remove));
                    System.out.println("Membro "+ remove +"Removido Com Sucesso!");
                }else{
                    System.out.println("Opção Invalida.");
                }



                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            case 5:
                System.out.println("Estamos em Horário: " + HoraAtual + ".\n");

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            case 6:
                if(HoraAtual == Horarios.REGULAR) {
                    HoraAtual = Horarios.EXTRA;
                } else {
                    HoraAtual = Horarios.REGULAR;
                }
                System.out.println("Troca De Horário Realizada com Sucesso.\n");
                System.out.println("Agora Estamos em Horario:"+HoraAtual);

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            case 7:
                System.out.println("Encerrando Sistema...");
                running = false;
                break;

            default:
                System.out.println("Opção Inválida!");
                break;

            }
        }
    }
}