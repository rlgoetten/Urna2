package Controladores;

import Interface.MenuCandidatos;
import Interface.MenuConfiguracoes;
import Interface.MenuInicial;
import Interface.TelaAdicionarCandidato;

public class ControladoresFacade {
    MenuCandidatos menuCand;
    MenuConfiguracoes menuConfig;
    MenuInicial menuIni;
    TelaAdicionarCandidato addTelaCand;
    ControladorCandidatos cc = ControladorCandidatos.getInstance();
    
    public void rodar(){
        menuIni.setDefaultCloseOperation(menuIni.EXIT_ON_CLOSE);
        menuIni.setVisible(true);
    }


    
    
}
