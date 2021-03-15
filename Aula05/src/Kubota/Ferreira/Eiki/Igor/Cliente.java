package Kubota.Ferreira.Eiki.Igor;

public class Cliente {
    private String Titular;
    private String CPF;

    public Cliente(String titular) {
        this.Titular = titular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Titular='" + Titular + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
