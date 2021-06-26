package Kubota.Ferreira.Eiki.Igor.Models;

import Kubota.Ferreira.Eiki.Igor.Interfaces.IApresentacao;
import Kubota.Ferreira.Eiki.Igor.Interfaces.IPostarMensagem;

import Kubota.Ferreira.Eiki.Igor.Enums.TiposMembros;


public abstract class Membro implements IApresentacao, IPostarMensagem {

    //atributos
    private String nome;
    private String email;
    private TiposMembros funcao;

    //Construtor
    public Membro(String nome, String email, TiposMembros funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }

    //getter e setter do nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //getter e setter do email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //getter e setter da funcao
    public TiposMembros getFuncao() {
        return funcao;
    }
    public void setFuncao(TiposMembros funcao) {
        this.funcao = funcao;
    }

    //tostring
    @Override
    public String toString() {
        return "Membro{" + "nome='" + nome + '\'' + ", email='" + email + '\'' + ", funcao=" + funcao + '}';
    }
}
