package carvalho.murilo.pedra_papael_tesoura.models.bazinga;

import carvalho.murilo.pedra_papael_tesoura.models.Jogada;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Papel;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Pedra;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Spoke(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }
    @Override
    public String toString() {
        return "Lagarto";
    }
}
