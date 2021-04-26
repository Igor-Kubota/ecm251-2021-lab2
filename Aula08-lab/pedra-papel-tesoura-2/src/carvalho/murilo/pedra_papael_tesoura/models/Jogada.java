package carvalho.murilo.pedra_papael_tesoura.models;

import carvalho.murilo.pedra_papael_tesoura.enumeracoes.Resultado;

public abstract class Jogada {
    final public Resultado verificaResultado(Jogada jogada) {
        if(verificaJogada(jogada, jogadasQueGanho())){
            return Resultado.GANHEI;
        }
        if(verificaJogada(jogada, jogadasQuePerco())){
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }

    final private boolean verificaJogada(Jogada jogada, Jogada[] jogadas){
        for (Jogada jogadaDaVez : jogadas) {
            if (jogadaDaVez.getClass() == jogada.getClass()) {
                return true;
            }
        }
        return false;
    }


    public abstract Jogada[] jogadasQueGanho();
    public abstract Jogada[] jogadasQuePerco();
}
