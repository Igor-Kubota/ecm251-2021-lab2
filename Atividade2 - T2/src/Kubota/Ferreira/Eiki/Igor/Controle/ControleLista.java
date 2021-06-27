package Kubota.Ferreira.Eiki.Igor.Controle;

import Kubota.Ferreira.Eiki.Igor.Models.Membro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class ControleLista {
    private ArrayList<Membro> ListaDeMembros = new ArrayList<Membro>();

    //getter
    public ArrayList<Membro> getListaDeMembros() {
        return ListaDeMembros;
    }

    public void AddMembro(Membro membro){
        this.ListaDeMembros.add(membro);
    }

    public void RemoverMembro(Membro membro){
        this.ListaDeMembros.remove(membro);

    }
    public static void Limpa()throws IOException {
        Writer out = new FileWriter("Dados.txt");

        //limpa
        out.write("");
        out.flush();

        //escreve
        out.flush();
        out.close();
    }

}
