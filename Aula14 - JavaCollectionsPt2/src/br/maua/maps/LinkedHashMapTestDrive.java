package br.maua.maps;

import br.maua.models.Item;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTestDrive {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new LinkedHashMap<>();

        //Insere Elementos nomapa
        itemMap.put("Item1" , new Item("Maca",1));
        itemMap.put("Item2" , new Item("Pera",2));
        itemMap.put("Item3" , new Item("Maca",1));
        itemMap.put("Item1" , new Item("Banana",3));

        //Passa por todos os elementos

        itemMap.forEach((chave, valor) -> System.out.println("Chave: " + chave + "\tValor: " + valor));

        System.out.println(itemMap +"\n");

        //ManipulaçÃO dos valores dentro do Map
        Item item = itemMap.get("Item2");
        System.out.println(item);
        item = itemMap.get("Goku");
        System.out.println(item);
        item = itemMap.getOrDefault("item10", new Item("Vegeta", 7999));
        System.out.println(item);

        System.out.println(itemMap);
    }
}
