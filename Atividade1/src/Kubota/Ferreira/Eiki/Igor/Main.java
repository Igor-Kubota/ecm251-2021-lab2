// Igor Eiki Ferreira Kubota
// RA: 19.02466-5

package Kubota.Ferreira.Eiki.Igor;


public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("All Might", "123", "Allmight" );
        Usuario usuario2 = new Usuario("One For All", "456", "Oneforall" );
        Usuario usuario3 = new Usuario("Bakugou", "789", "Bakugou" );


        usuario1.CriarConta(1000.0);

        System.out.println("Estado Inicial: ");
        System.out.println("Nome do Usuario 1: " + usuario1.getNome() + " Saldo: " + usuario1.getConta().getSaldo());




    }
}
