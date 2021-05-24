package br.maua.linked_list_test_drive;

import br.maua.models.Conta;
import br.maua.models.Pessoa;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("midoriya", "999"));
        pessoas.add(new Pessoa("bakugou","998"));
        pessoas.add(new Pessoa("Todoroki","997"));
        pessoas.add(0,new Pessoa("Uraraka", "1000"));
        pessoas.addFirst(new Pessoa("All Might", "001"));


        System.out.println("pessoas: ");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        LinkedList<Conta> contas = new LinkedList<>();
        contas.addAll(Arrays.asList(new Conta(10), new Conta(20), new Conta(25)));


        System.out.println("----------------------------");
        System.out.println("Passa pela lista de Contas: ");
        contas.forEach(conta -> System.out.println(conta));



    }

}
