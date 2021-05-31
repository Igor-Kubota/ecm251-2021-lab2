package br.maua.sets;

import br.maua.models.Item;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTestDrive {
    public static void main(String[] args) {
        Set<Item> ItemSet = new LinkedHashSet<>();

        //Adiciona itens no HashSet
        ItemSet.add(new Item("Maca",1));
        ItemSet.add(new Item("Pera",2));
        ItemSet.add(new Item("Maca",1));
        ItemSet.add(new Item("Banana",3));

        //Passa por todos os elementos
        ItemSet.forEach(Item -> System.out.println(Item));

    }
}
