package Kubota.Ferreira.Eiki.Igor.Models;

import Kubota.Ferreira.Eiki.Igor.Enums.Horarios;
import Kubota.Ferreira.Eiki.Igor.Enums.TiposMembros;

public class HeavyLifters extends Membro{

    public HeavyLifters(String nome, String email, TiposMembros funcao){
        super(nome, email, funcao);

    }


    @Override
    public void ExibirRelatorio() {
        System.out.println(
                "Eu sou o "         +getNome()+
                " de email "        +getEmail()+
                " com a Função de " +getFuncao()
        );

    }

    public void Mensagem(Horarios horario) {
        switch (horario) {
            default:
                break;
            case REGULAR:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Podem contar conosco!\n");
                break;

            case EXTRA:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("N00b_qu3_n_Se_r3pita.bat\n");
                break;
        }


    }
}
