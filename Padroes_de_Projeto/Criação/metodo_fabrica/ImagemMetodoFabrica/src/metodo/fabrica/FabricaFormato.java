package metodo.fabrica;

public class FabricaFormato {

    public static Formato gerarFormato(String formato) {
        Formato gerador = null;
        
        switch (formato){ 
        	case "jpeg":
        		gerador = new FormatoJpeg();
        		return gerador;
        	case "png":
        		gerador = new FormatoPng();
        		return gerador;
        	case "bmp":
        		gerador = new FormatoBmp();
        		return gerador;
        	case "gif":
        		gerador = new FormatoGif();
        		return gerador;
        	
        	default:
        		return gerador;
        }
       
   
    }
}
