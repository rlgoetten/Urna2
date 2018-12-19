package Controladores;

import Classes.Eleitor;
import Classes.Florianopolis;
import Classes.SaoJose;
import Classes.Municipio;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class ControladorEleitores {
    private static final ControladorEleitores INSTANCE = new ControladorEleitores();
    private ArrayList<Eleitor> eleitores = new ArrayList<>();
    private ArrayList<Eleitor> eleitoresVotados = new ArrayList<>();
    
    Florianopolis f1 = Florianopolis.getInstance();
    SaoJose sj  = SaoJose.getInstance();
    
    private ControladorEleitores(){
    }
    
    //Quando quiserr usar o objeto da classe, chamar esse método
    public static ControladorEleitores getInstance(){
        return ControladorEleitores.INSTANCE;
    }
    
    //Cadastra um novo eleitor
    public void cadastrarEleitor(String nome, int cpf, int titulo, Municipio mun, int zona){
        Eleitor eleitor = new Eleitor(nome, titulo, cpf, mun, zona);
        addEleitor(eleitor);
    }
    
    //Chegagem de municipio
    public Municipio checaMunicipio(String cidade){
        Municipio mun;
        
        if(cidade == "Florianópolis")
            mun = f1;
        else
            mun = sj;
        return mun;
    }
    
    //Adiciona novo eleitor ao array de eleitores
    public void addEleitor(Eleitor eleitor){
        eleitores.add(eleitor);
    }
    
    //Encontrar eleitor
    public void encontrarEleitor(String nome, int titulo){
        boolean encontrou = false;
        int i = 0;
        
        while(encontrou == false && i < eleitores.size()){
            if(eleitores.get(i).getNome().equals(nome) && eleitores.get(i).getTitulo() == titulo){
                JOptionPane.showMessageDialog(null, "Nome: " + eleitores.get(i).getNome() + " | CPF: "+ eleitores.get(i).getCpf() + " | Título: "
                + eleitores.get(i).getTitulo() + " | Município: " + eleitores.get(i).getMunicipio() + " | Zona: " + eleitores.get(i).getZona() );
                encontrou = true;
            }else
                i++;
        }
                
        if(encontrou == false)
            JOptionPane.showMessageDialog(null, "Eleitor não encontrado");
    }
    
    //Excluir eleitor
    public boolean excluirEleitor(String nome, int titulo){
        boolean exclui = false;
        int i = 0;
        while(exclui == false && i < eleitores.size()){
            if(eleitores.get(i).getNome().equals(nome) && eleitores.get(i).getTitulo() == titulo ){
                eleitores.remove(i);
                exclui = true;
            }else
                i++;
        }
        return exclui;
    }
    
    //Checa se o eleitor existe
    public boolean checaEleitor(int titulo){
        boolean existe = false;
        int i = 0;
        while(existe == false && i < eleitores.size()){
            if(eleitores.get(i).getTitulo()==titulo)
                existe = true;
            else
                i++;
        }
        
        return existe;
    }
    
    //Retorna eleitor pelo titulo
    public Eleitor retornaEleitor(int titulo){
        Eleitor e  = null;
        boolean existe = false;
        int i = 0;
        while(existe == false && i < eleitores.size()){
            if(eleitores.get(i).getTitulo()==titulo){
                existe = true;
                e  = eleitores.get(i);
            }
            else
                i++;
        }
        
        return e;
    }
    
    public void addEleitorVotado(Eleitor e){
        eleitoresVotados.add(e);        
    }
    
    //Checa se o eleitor votou
    public boolean checaEleitoresVotado(int titulo){
        boolean existe = false;
        int i = 0;
        while(existe == false && i < eleitoresVotados.size()){
            if(eleitoresVotados.get(i).getTitulo()==titulo)
                existe = true;
            else
                i++;
        }
        
        return existe;
    }
    
    //Adicionar todos os eleitores no array de eleitores que já votaram para que não seja mais possível votar
    public void addTodosEleitoresVotados(){
        for(int i = 0; i < eleitores.size(); i++){
            if(checaEleitoresVotado(eleitores.get(i).getTitulo()) == false)
                eleitoresVotados.add(eleitores.get(i));
        }
    }
    
}
