package Kubota.Ferreira.Eiki.Igor.Models;

import Kubota.Ferreira.Eiki.Igor.Enums.Horarios;
import Kubota.Ferreira.Eiki.Igor.Enums.TiposMembros;

public class MobileMembers extends Membro{

    public MobileMembers(String nome, String email, TiposMembros funcao){
        super(nome, email, funcao);

    }


    @Override
    public void ExibirRelatorio() {

    }

    @Override
    public void Mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case REGULAR:
                System.out.println("Happy Coding!");
                break;
            case EXTRA:
                System.out.println("Happy_C0d1ng. Maskers.");
                break;
        }


    }
}
