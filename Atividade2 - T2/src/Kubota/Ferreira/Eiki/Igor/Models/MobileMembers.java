package Kubota.Ferreira.Eiki.Igor.Models;

import Kubota.Ferreira.Eiki.Igor.Enums.Horarios;
import Kubota.Ferreira.Eiki.Igor.Enums.TiposMembros;

import java.sql.SQLOutput;

public class MobileMembers extends Membro{

    public MobileMembers(String nome, String email, TiposMembros funcao){
        super(nome, email, funcao);

    }


    @Override
    public void ExibirRelatorio() {
        System.out.println(
                "nome: "    +getNome()+"\n"+
                "email: "   +getEmail()+"\n"+
                "Função: "  +getFuncao()+ "\n"
        );


    }

    @Override
    public void Mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case REGULAR:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Happy Coding!\n");
                break;

            case EXTRA:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Happy_C0d1ng. Maskers.\n");
                break;
        }


    }
}
