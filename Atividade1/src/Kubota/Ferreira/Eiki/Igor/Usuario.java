
// Igor Eiki Ferreira Kubota
// RA: 19.02466-5


package Kubota.Ferreira.Eiki.Igor;

public class Usuario {

    //atributos
    private String nome;
    private String senha;
    private String email;
    private Conta conta;


    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;

    }

    public String getNome() {
        return this.nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getEmail() {
        return this.email;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void CriarConta(Double saldo){
        this.conta = new Conta(saldo);
    }

    public String Requisitar(double valor){
        this.conta.CriarQrCode(this.nome , valor);
        String QRCode = Transacoes.GerarQrcode(conta.getIdConta(), this.nome, valor);
        return QRCode;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }
}
