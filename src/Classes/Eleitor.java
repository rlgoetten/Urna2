
package Classes;

public class Eleitor {
    //Variaveis
    private String nome;
    private int titulo;
    private int cpf;
    private Municipio municipio;
    private int zona;

    //Metodos
    public Eleitor(String nome, int titulo, int cpf, Municipio municipio, int zona) {
        this.nome = nome;
        this.titulo = titulo;
        this.cpf = cpf;
        this.municipio = municipio;
        this.zona = zona;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    }

