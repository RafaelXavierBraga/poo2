

package refeicao;

import java.io.Serializable;

/**
 *
 * @author felipe
 */
public class Hamburger implements Cloneable, Serializable {
    
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
            
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }        
        return obj;
    }
    
}
