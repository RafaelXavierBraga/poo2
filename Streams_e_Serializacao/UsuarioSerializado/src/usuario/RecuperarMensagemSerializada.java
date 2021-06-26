package usuario;

import java.io.*;

public class RecuperarMensagemSerializada {

    public static void main(String[] args) throws Exception {
        {
            Mensagem m = null;
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + 
                    "\\src\\mensagem_serializada.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            m = (Mensagem) in.readObject();
            in.close();

            System.out.println("Deserializando Mensagem...");
            System.out.println("Mensagem: " + m.getTexto());

        }
    }
}
