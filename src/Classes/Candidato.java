package Classes;

import java.util.logging.Logger;

public class Candidato {
    private String nome;
    private int num;
    private String partido;
    private int qtdVotos = 0;
    private String cargo;
    
    public Candidato(String nome, int num, String partido, String cargo) {
        this.nome = nome;
        this.num = num;
        this.partido = partido;
        this.cargo = cargo;
    }

    public int getQtdVotos(){
        return qtdVotos;
    }
    
    public void addVoto(){
        qtdVotos++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    
    
    public String getCargo(){
        return cargo;
    }
}
