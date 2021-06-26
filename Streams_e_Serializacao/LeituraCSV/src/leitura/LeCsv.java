
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     private String[] split;

    public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
         LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        
        BufferedReader b = new BufferedReader(in);

        String linha;
        linha = b.readLine();
        linha = b.readLine();
        
        while(linha != null){
            Cliente cliente = new Cliente();
            
            String[] vetor = linha.split(";");
            
            cliente.setId(vetor[0]);
            cliente.setNome(vetor[1]);
            cliente.setEmail(vetor[2]);
            cliente.setTelefone(vetor[4]);
            cliente.setTotalCompras(Double.parseDouble(vetor[5]));
            
            clientes.add(cliente);
            linha = b.readLine();
        }


        in.close(); 
        return clientes;
     }
}
