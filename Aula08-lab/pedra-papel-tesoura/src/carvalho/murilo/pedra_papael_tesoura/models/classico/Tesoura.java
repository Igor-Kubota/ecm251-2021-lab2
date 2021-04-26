package carvalho.murilo.pedra_papael_tesoura.models.classico;

import carvalho.murilo.pedra_papael_tesoura.models.Jogada;
import carvalho.murilo.pedra_papael_tesoura.models.bazinga.Lagarto;
import carvalho.murilo.pedra_papael_tesoura.models.bazinga.Spoke;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Papel;
import carvalho.murilo.pedra_papael_tesoura.models.classico.Pedra;

public class Tesoura extends Jogada {

    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Spoke) || (jogada instanceof Pedra);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
