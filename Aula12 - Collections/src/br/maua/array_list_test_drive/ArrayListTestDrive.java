package br.maua.array_list_test_drive;

import br.maua.models.Conta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        //cria um ArrayList de contas
        List<Conta> contas  = new ArrayList<>();

        //Adiciona objetos Conta dentro do Arraylist
        contas.add(new Conta(89));
        contas.add(new Conta());
        contas.add(1, new Conta(55));
        contas.addAll(Arrays.asList(new Conta(), new Conta(58)));

        System.out.println("Exibe o arraylist de contas: ");
        contas.forEach((conta) -> System.out.println(conta));




        //retira um elemento do arraylist
        contas.remove(3);

        System.out.println("----------------------------");
        System.out.println("Exibe o arraylist de contas: ");
        contas.forEach((conta) -> System.out.println(conta));
    }



}
