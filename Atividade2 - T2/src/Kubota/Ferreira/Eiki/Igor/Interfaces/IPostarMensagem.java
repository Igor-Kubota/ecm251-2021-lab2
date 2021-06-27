package Kubota.Ferreira.Eiki.Igor.Interfaces;

import Kubota.Ferreira.Eiki.Igor.Enums.Horarios;

public interface IPostarMensagem {

    /**
     * Interface responsável pela postagem da mensagem através da void Mensagem
     * @param horario horario em que a mensagem sera postada
     */

    public abstract void Mensagem(Horarios horario);
}
