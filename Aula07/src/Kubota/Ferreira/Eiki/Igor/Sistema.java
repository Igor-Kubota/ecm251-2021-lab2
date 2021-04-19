package Kubota.Ferreira.Eiki.Igor;

import java.util.Random;
import java.util.Scanner;

public class Sistema {
    private Jogador jogador1;
    private Jogador jogador2;
    private Scanner scanner;
    private final Jogada [] jogadas = new Jogada[]{new Pedra(), new Papel(), new Tesoura()};


    public Sistema(){
        scanner= new Scanner(System.in);
        inicializaJogadores();

    }


    private void inicializaJogadores(){
        System.out.println("Informe o jogador 1: ");
        String nome = scanner.next();
        jogador1 = new Jogador(nome, true);
        jogador2 = new Jogador("NPC");


    }
    public void run(){
        while(true){
            System.out.println("Player 1 : " + jogador1 + " vs player 2: " + jogador2 );
            jogador1.setJogada(selecionaJogada());
            jogador2.setJogada(sorteiaJogada());
            System.out.println("Jogada jogador 1: " + jogador1.getJogada());
            System.out.println("Jogada jogador 1: " + jogador2.getJogada());
            System.out.println("Resultado: " + jogador1.getJogada().verificaResultado(jogador2.getJogada())+ "\n");

        }

    }

    private Jogada selecionaJogada(){
        System.out.println("Escolha:\n 0 - Pedra\n 1 - Papel\n 2 - Tesoura");
        int escolha = scanner.nextInt();
        return jogadas[escolha];

    }

    private Jogada sorteiaJogada(){
        return jogadas[new Random().nextInt(jogadas.length)];
    }

}
