/*

    Igor Eiki Ferreira Kubota
    RA: 19.02466-5

*/

package Kubota.Ferreira.Eiki.Igor;


public class Main {

    public static void main(String[] args) {
        //Criando os Usuarios.
        Usuario usuario1 = new Usuario("All Might", "123", "Allmight@email.com" );
        Usuario usuario2 = new Usuario("One For All", "456", "Oneforall@email.com" );
        Usuario usuario3 = new Usuario("Bakugou", "789", "Bakugou@email.com" );

        //Criando as Contas para os Usuarios.
        usuario1.CriarConta(1000.0);
        usuario2.CriarConta(250.0);
        usuario3.CriarConta(3000.0);

        //Indicando os Estados iniciais das contas.
        System.out.println("Estado Inicial: ");
        System.out.println("Nome do Usuario 1: " + usuario1.getNome() + " - Saldo: " + usuario1.getConta().getSaldo());
        System.out.println("Nome do Usuario 2: " + usuario2.getNome() + " - Saldo: " + usuario2.getConta().getSaldo());
        System.out.println("Nome do Usuario 3: " + usuario3.getNome() + " - Saldo: " + usuario3.getConta().getSaldo()+"\n");

        //Operações de Teste.
        usuario1.Requisitar(250.0);

        Transacoes.PagarRequisito(usuario2, usuario1, usuario1.getConta().getQrcode());
        Transacoes.PagarRequisito(usuario3, usuario1, usuario1.getConta().getQrcode());
        Transacoes.PagarRequisito(usuario2, usuario1, usuario1.getConta().getQrcode());


        usuario2.Requisitar(1000.0);

        Transacoes.PagarRequisito(usuario3, usuario2, usuario2.getConta().getQrcode());


        //Estado final das Contas após as Operações.
        System.out.println("\nEstado Final: ");
        System.out.println("Nome do Usuario 1: " + usuario1.getNome() + " - Saldo: " + usuario1.getConta().getSaldo());
        System.out.println("Nome do Usuario 2: " + usuario2.getNome() + " - Saldo: " + usuario2.getConta().getSaldo());
        System.out.println("Nome do Usuario 3: " + usuario3.getNome() + " - Saldo: " + usuario3.getConta().getSaldo());

    }

}
