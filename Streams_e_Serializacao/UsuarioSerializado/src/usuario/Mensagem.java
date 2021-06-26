package usuario;

import java.io.Serializable;

public class Mensagem implements Serializable {
    String texto;

    public void setTexto(String s){
        this.texto = s;
    }
    public String getTexto(){
        return this.texto;
    }
}
