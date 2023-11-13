package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo {
    //todo filme tem tudo o Titulo
    //Todo filme é um titulo
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}