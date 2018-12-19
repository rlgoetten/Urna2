package Controladores;

import Classes.Candidato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Usei singleton  para que não perdesse os dados indo de um frame para o outro
public final class ControladorCandidatos {
    private static final ControladorCandidatos INSTANCE = new ControladorCandidatos();
    
    private ControladorCandidatos(){
    }
    
    //Quando quiserr usar o objeto da classe, chamar esse método
    public static ControladorCandidatos getInstance(){
        return ControladorCandidatos.INSTANCE;
    }
    
    //Arrays para guardar os candidatos
    private ArrayList<Candidato> presidentes = new ArrayList<Candidato>();
    private ArrayList<Candidato> governadores = new ArrayList<>();
    private ArrayList<Candidato> deputados = new ArrayList<>();
    
    //Instanciando os presidentes já existentes
    Candidato c1 = new Candidato("Bolsonaro", 17, "PSL", "Presidente");
    Candidato c2 = new Candidato("Haddad", 13, "PT", "Presidente");
    Candidato c3 = new Candidato("Ciro Gomes", 12, "PDT", "Presidente");
    Candidato c4 = new Candidato("Boulos", 50, "PSOL", "Presidente");
    Candidato c5 = new Candidato("Alckmin", 45, "PSDB", "Presidente");
    Candidato c6 = new Candidato("Meirelles", 15, "MDB", "Presidente");
    
    public void addPresidentesExistentes(){
        presidentes.add(c1);
        presidentes.add(c2);
        presidentes.add(c3);
        presidentes.add(c4);
        presidentes.add(c5);
        presidentes.add(c6);
    }
    
    //Método usado para adicionar novo candidato
    public void cadastrarCandidato(String nome, String partido, String cargo, int num){
        Candidato cand = new Candidato(nome, num, partido, cargo);
        addCandidato(cargo,cand);
    }
    
    //Retorna os presidentes
    public void retornaPresidente(){
        for(int i = 0; i < presidentes.size(); i++){
            JOptionPane.showMessageDialog(null,"Nome: " + presidentes.get(i).getNome() + " | Partido: "+ presidentes.get(i).getPartido() + " | Cargo: "+ presidentes.get(i).getCargo());
        }
    }
    
    //Retorna os governadores
    public void retornaGovernador(){
        for(int i = 0; i < governadores.size(); i++)
            JOptionPane.showMessageDialog(null,"Nome: " + governadores.get(i).getNome() + " | Partido: "+ governadores.get(i).getPartido() + " | Cargo: "+ governadores.get(i).getCargo());
    }
    
    //Retorna os deputados
    public void retornaDeputado(){
        for(int i = 0; i < deputados.size(); i++)
            JOptionPane.showMessageDialog(null,"Nome: " + deputados.get(i).getNome() + " | Partido: "+ deputados.get(i).getPartido() + " | Cargo: "+ deputados.get(i).getCargo());
    }
    
    //Adiciona o candidato no array de acordo com o cargo
    public void addCandidato(String cargo, Candidato cand){
        if(cargo == "Presidente")
            presidentes.add(cand);
        else{
            if(cargo == "Governador")
                governadores.add(cand);
            else
                deputados.add(cand);
        }
    }
    
    //Exclui candidato
    public boolean excluirPresidente(String nome){
        boolean exclui = false;
        int i = 0;
        while(exclui == false && i < presidentes.size()){
            if(presidentes.get(i).getNome().equals(nome)){
                presidentes.remove(i);
                exclui = true;
            }else
                i++;
        }
        return exclui;
    }
    
    //Exclui governador
    public boolean excluirGovernador(String nome){
        boolean exclui = false;
        int i = 0;
        while(exclui == false && i < governadores.size()){
            if(governadores.get(i).getNome().equals(nome)){
                governadores.remove(i);
                exclui = true;
            }else
                i++;
        }
        return exclui;
    }
    
    //Exclui deputado
    public boolean excluirDeputado(String nome){
        boolean exclui = false;
        int i = 0;
        while(exclui == false && i < deputados.size()){
            if(deputados.get(i).getNome().equals(nome)){
                deputados.remove(i);
                exclui = true;
            }else
                i++;
        }
        return exclui;
    }
    
    public void encontrarPresidente(String nome){
        boolean encontrou = false;
        int i = 0;
        
        while(encontrou == false && i < presidentes.size()){
            if(presidentes.get(i).getNome().equals(nome)){
                JOptionPane.showMessageDialog(null, "Nome: " + presidentes.get(i).getNome() + " | Partido: "+ presidentes.get(i).getPartido() + " | Cargo: "+ presidentes.get(i).getCargo() + " | Número: " + presidentes.get(i).getNum());
                encontrou = true;
            }else
                i++;
        }
                
        if(encontrou == false)
            JOptionPane.showMessageDialog(null, "Presidente não encontrado");
    }
    
    //Encontrar Governador
    public void encontrarGovernador(String nome){
        boolean encontrou = false;
        int i = 0;
        
        while(encontrou == false && i < governadores.size()){
            if(governadores.get(i).getNome().equals(nome)){
                JOptionPane.showMessageDialog(null, "Nome: " + governadores.get(i).getNome() + " | Partido: "+ governadores.get(i).getPartido() + " | Cargo: "+ governadores.get(i).getCargo() + " | Número: " + governadores.get(i).getNum());
                encontrou = true;
            }else
                i++;
        }
        
        if(encontrou == false)
            JOptionPane.showMessageDialog(null, "Governador não encontrado");
    }
    
    //Encontrar Deputado
    public void encontrarDeputado(String nome){
        boolean encontrou = false;
        int i = 0;
        
        while(encontrou == false && i < deputados.size()){
            if(deputados.get(i).getNome().equals(nome)){
                JOptionPane.showMessageDialog(null, "Nome: " + deputados.get(i).getNome() + " | Partido: "+ deputados.get(i).getPartido() + " | Cargo: "+ deputados.get(i).getCargo() + " | Número: " + deputados.get(i).getNum());
                encontrou = true;
            }else
                i++;
        }
        
        if(encontrou == false)
            JOptionPane.showMessageDialog(null, "Deputado não encontrado");
    }
    
    //Checa se existe presidente
    public boolean checaPresidente(int num){
        boolean existe = false;
        int i = 0;
        while(existe == false && i < presidentes.size()){
            if(presidentes.get(i).getNum()==num)
                existe = true;
            else
                i++;
        }
        
        return existe;
    }
    
    //Checa se existe governador
    public boolean checaGovernador(int num){
        boolean existe = false;
        int i = 0;
        while(existe == false && i < governadores.size()){
            if(governadores.get(i).getNum()==num)
                existe = true;
            else
                i++;
        }
        
        return existe;
    }
    
    //Checa se existe deputado
    public boolean checaDeputado(int num){
        boolean existe = false;
        int i = 0;
        while(existe == false && i < deputados.size()){
            if(deputados.get(i).getNum()==num)
                existe = true;
            else
                i++;
        }
        
        return existe;
    }
    
    //Adiciona voto ao cand
    public void addVotoPresidente(int num){
        boolean add = false;
        int i = 0;
        while(add == false){
            if(presidentes.get(i).getNum() == num){
                presidentes.get(i).addVoto();
                add = true;
            }
        }
    }
    
    public void addVotoGovernador(int num){
        boolean add = false;
        int i = 0;
        while(add == false){
            if(governadores.get(i).getNum() == num){
                governadores.get(i).addVoto();
                add = true;
            }
        }
    }
    
    public void addVotoDeputado(int num){
        boolean add = false;
        int i = 0;
        while(add == false){
            if(deputados.get(i).getNum() == num){
                deputados.get(i).addVoto();
                add = true;
            }
        }
    }
    
    public void relatorioPresidentes(){
        int maior = 0;
        
        for(int i = 0; i < presidentes.size(); i++){
            if(presidentes.get(i).getQtdVotos()>presidentes.get(maior).getQtdVotos())
                maior = i;
        }
        
        JOptionPane.showMessageDialog(null,"O Presidente eleito foi: " + presidentes.get(maior).getNome() + " do partido " + presidentes.get(maior).getPartido());
    }
    
    public void relatorioGovernadores(){
        int maior = 0;
        
        for(int i = 0; i < governadores.size(); i++){
            if(governadores.get(i).getQtdVotos()>governadores.get(maior).getQtdVotos())
                maior = i;
        }
        
        JOptionPane.showMessageDialog(null,"O Governador eleito foi: " + governadores.get(maior).getNome() + " do partido " + governadores.get(maior).getPartido());
    }
    
    public void relatorioDeputados(){
        int maior = 0;
        
        for(int i = 0; i < deputados.size(); i++){
            if(deputados.get(i).getQtdVotos()>deputados.get(maior).getQtdVotos())
                maior = i;
        }
        
        JOptionPane.showMessageDialog(null,"O Deputado Federal Eleito foi: " + deputados.get(maior).getNome() + " do partido " + deputados.get(maior).getPartido());
    }
    
}
