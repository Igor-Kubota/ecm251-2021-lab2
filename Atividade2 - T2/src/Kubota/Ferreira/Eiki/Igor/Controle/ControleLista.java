package Kubota.Ferreira.Eiki.Igor.Controle;

import Kubota.Ferreira.Eiki.Igor.Models.Membro;

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
        this.ListaDeMembros.remove(membro)


    }
}
