package Kubota.Ferreira.Eiki.Igor;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Titulo {
    private double valor;
    private String nome;
    private double jurosPorDia;
    private LocalDate dataPagamento;

    public Titulo(double valor, String nome, double jurosPorDia, String dataPagamento) {

        this.valor = valor;
        this.nome = nome;
        this.jurosPorDia = jurosPorDia;
        this.dataPagamento = LocalDate.parse(dataPagamento);
    }

    public double getvalorPagamento(){
        if(!contaAtrasada()){
            return this.valor;
        }else{
            return calcularValorComJuros();
        }

    }

    private double calcularValorComJuros() {
        return this.valor + this.valor * this.jurosPorDia * dataPagamento.until(LocalDate.now(),DAYS);
    }

    private boolean contaAtrasada() {
        return LocalDate.now().isAfter(dataPagamento);
    }
}
