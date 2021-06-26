package usuario;

import java.io.*;

public class SaveMensagemSerializada {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        Mensagem mensagem = new Mensagem();
        mensagem.setTexto("OI MUNDO");       
               
        FileOutputStream fileSerializado = new FileOutputStream( 
                current + "\\src\\mensagem_serializada.ser");                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(mensagem);
        outputSerializado.close();
    
        System.out.println("Mensagem Salva");        
        System.out.println("Arquivo gerado em: " + current + 
                "\\src\\mensagem_serializada.ser");
        
        
    }
}