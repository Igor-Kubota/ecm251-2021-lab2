package br.maua.array_test_drive;

import br.maua.models.Conta;

public class ArrayTestDrive {


    public static void main(String[] args) {
        // array para tipos primitivos
        int[] numeros = new int[5];
        numeros[0] = 6;
        numeros[1] = 5;
        numeros[2] = 67;
        numeros[3] = 68;
        numeros[4] = 96;


        System.out.println("passa pelos elementos: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("posicao: "+ i + " valor: " + numeros[i]);
        }


        //Array para objetos
        Conta[] contas = new Conta[]{
                new Conta(15.),
                new Conta(89.),
                new Conta(),
                null,
                new Conta(900.)};


        System.out.println("---------------------");
        System.out.println("passa pelas contas: ");
        for(Conta conta : contas){
            System.out.println(conta);
        }


    }
}
