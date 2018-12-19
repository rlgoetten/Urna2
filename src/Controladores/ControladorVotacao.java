package Controladores;

import Classes.*;
import Controladores.*;
import javax.swing.JOptionPane;

public final class ControladorVotacao {
    private static final ControladorVotacao INSTANCE = new ControladorVotacao();
    private ControladorVotacao(){
    }
    
    ControladorEleitores ce = ControladorEleitores.getInstance();
    ControladorCandidatos cc = ControladorCandidatos.getInstance();
    
    //Quando quiserr usar o objeto da classe, chamar esse método
    public static ControladorVotacao getInstance(){
        return ControladorVotacao.INSTANCE;
    }

    //Adiciona voto
    public void addVoto(int titulo, int numPres, int numGov, int numDep){
        if(ce.checaEleitor(titulo) == true && cc.checaDeputado(numDep) == true && cc.checaGovernador(numGov) == true && cc.checaPresidente(numPres) == true && ce.checaEleitoresVotado(titulo) == false){
            cc.addVotoPresidente(numPres);
            cc.addVotoGovernador(numGov);
            cc.addVotoDeputado(numDep);
            JOptionPane.showMessageDialog(null, "Voto feito com sucesso");
        }else
            JOptionPane.showMessageDialog(null, "Aconteceu algo de errado (Titulo inexistente, número do candiato errado  ou candidato já efetuou o voto)");
            
        ce.addEleitorVotado(ce.retornaEleitor(titulo));
    }
    
    
    
}
