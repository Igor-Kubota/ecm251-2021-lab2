package carvalho.murilo.pedra_papael_tesoura.models;

import carvalho.murilo.pedra_papael_tesoura.enumeracoes.Resultado;

public abstract class Jogada {
    final public Resultado verificaResultado(Jogada jogada) {
        if(verificaSeGanhei(jogada)){
            return Resultado.GANHEI;
        }
        if(verificaSePerdi(jogada)){
            return Resultado.PERDI;
        }
        return Resultado.EMPATEI;
    }

    public abstract boolean verificaSeGanhei(Jogada jogada);

    public abstract boolean verificaSePerdi(Jogada jogada);
}
