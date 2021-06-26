package Kubota.Ferreira.Eiki.Igor.Models;

import Kubota.Ferreira.Eiki.Igor.Enums.Horarios;
import Kubota.Ferreira.Eiki.Igor.Enums.TiposMembros;

public class ScriptGuys extends Membro{

    public ScriptGuys(String nome, String email, TiposMembros funcao){
        super(nome, email, funcao);

    }


    @Override
    public void ExibirRelatorio() {

    }

    @Override
    public void Mensagem(Horarios horario){
        switch (horario) {
            default:
                break;
            case REGULAR:
                System.out.println("Prazer em ajudar novos amigos de código!");
                break;
            case EXTRA:
                System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
        }

    }
}

