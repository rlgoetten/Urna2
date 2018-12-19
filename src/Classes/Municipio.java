package Classes;
        
import java.util.ArrayList;

public abstract class Municipio {
    private String nome;

    public Municipio(String nome){
       this.nome=nome;
    }
   
    public String getNome(){
       return nome;
    }

}
