
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //controi uma refeicao.
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco");                
        
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante");
        
        Refeicao refeicao3 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", "batata"); 
        
        Refeicao refeicao4 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", "batata");    
    }    
}
