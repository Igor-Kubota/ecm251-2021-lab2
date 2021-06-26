package Kubota.Ferreira.Eiki.Igor.Models;

import Kubota.Ferreira.Eiki.Igor.Enums.Horarios;
import Kubota.Ferreira.Eiki.Igor.Enums.TiposMembros;

public class ScriptGuys extends Membro{

    public ScriptGuys(String nome, String email, TiposMembros funcao){
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
    public void Mensagem(Horarios horario){
        switch (horario) {
            default:
                break;
            case REGULAR:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Prazer em ajudar novos amigos de código!\n");
                break;
                
            case EXTRA:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("QU3Ro_S3us_r3curs0s.py\n");
                break;
        }

    }
}

