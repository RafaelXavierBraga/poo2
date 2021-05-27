/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String escolha = JOptionPane.showInputDialog("Tim, Vivo ou Claro?");
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone?"));
        String texto = JOptionPane.showInputDialog("Mensagem");
        Mensagem msg = new Mensagem(texto);                
        FabricaAbstrataEnvios fabrica = null;                              
       
        switch (escolha) {
        case "tim":{
        	fabrica = new FabricaTim();
        }
        case "vivo":{
        	fabrica = new FabricaVivo();
        }
        case "claro":{
        	fabrica = new FabricaClaro();
        }
        
        }
             
        EnvioSMS envio = fabrica.criaEnvioSMS();
        if(envio.enviar(msg, telefone)){            
            Cobranca cobranca = fabrica.criaCobranca();
            cobranca.cobrar(telefone);
        }                
    }
    
}
