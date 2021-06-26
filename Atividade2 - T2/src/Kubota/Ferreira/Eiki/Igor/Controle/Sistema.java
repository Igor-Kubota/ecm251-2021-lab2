package Kubota.Ferreira.Eiki.Igor.Controle;

import Kubota.Ferreira.Eiki.Igor.Enums.*;
import Kubota.Ferreira.Eiki.Igor.Models.*;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Sistema{
    final private static Scanner scanner = new Scanner(System.in);

    final private static ControleLista lista = new ControleLista();
    private static Horarios HoraAtual = Horarios.REGULAR;


    public static void run() throws InterruptedException, IOException {
        boolean running = true;

        //Membro membro0 = new HeavyLifters("a","b",TiposMembros.HeavyLifters);


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
                //cadastro.Cadastrar();

                Membro membro = cadastro.Listar();
                lista.AddMembro(membro);
                System.out.println("Membro Adicionado!");

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

                
            case 2:
                lista.getListaDeMembros();

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;


            case 3:
                for(Membro membros : lista.getListaDeMembros())
                    membros.Mensagem(HoraAtual);

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            case 4:
                for(Membro membros : lista.getListaDeMembros())
                    membros.ExibirRelatorio();

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
