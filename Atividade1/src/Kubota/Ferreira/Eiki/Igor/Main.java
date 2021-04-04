// Igor Eiki Ferreira Kubota
// RA: 19.02466-5

package Kubota.Ferreira.Eiki.Igor;


public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("All Might", "123", "Allmight@email.com" );
        Usuario usuario2 = new Usuario("One For All", "456", "Oneforall@email.com" );
        Usuario usuario3 = new Usuario("Bakugou", "789", "Bakugou@email.com" );


        usuario1.CriarConta(1000.0);
        usuario2.CriarConta(250.0);
        usuario3.CriarConta(3000.0);

        System.out.println("Estado Inicial: ");
        System.out.println("Nome do Usuario 1: " + usuario1.getNome() + " Saldo: " + usuario1.getConta().getSaldo());
        System.out.println("Nome do Usuario 2: " + usuario2.getNome() + " Saldo: " + usuario2.getConta().getSaldo());
        System.out.println("Nome do Usuario 3: " + usuario3.getNome() + " Saldo: " + usuario3.getConta().getSaldo());



    }
}
