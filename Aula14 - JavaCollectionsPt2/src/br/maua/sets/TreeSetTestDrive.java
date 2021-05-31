package br.maua.sets;

import br.maua.models.Item;
import br.maua.models.ItemComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestDrive {
    public static void main(String[] args) {
        Set<Item> ItemSet = new TreeSet<>(new ItemComparator());

        //Adiciona itens no HashSet
        ItemSet.add(new Item("Maca",1));
        ItemSet.add(new Item("Pera",2));
        ItemSet.add(new Item("Maca",1));
        ItemSet.add(new Item("Banana",3));

        //Passa por todos os elementos
        ItemSet.forEach(Item -> System.out.println(Item));

    }
}
