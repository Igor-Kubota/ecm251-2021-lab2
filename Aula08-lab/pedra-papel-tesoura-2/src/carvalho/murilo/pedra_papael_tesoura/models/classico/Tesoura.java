package carvalho.murilo.pedra_papael_tesoura.models.classico;

import carvalho.murilo.pedra_papael_tesoura.models.Jogada;
import carvalho.murilo.pedra_papael_tesoura.models.bazinga.Lagarto;
import carvalho.murilo.pedra_papael_tesoura.models.bazinga.Spoke;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Papel;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Pedra;

public class Tesoura extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
