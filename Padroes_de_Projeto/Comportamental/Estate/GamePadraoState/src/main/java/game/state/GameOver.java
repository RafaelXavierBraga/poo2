
package game.state;

import game.observer.SimpleSlickGame;
import org.newdawn.slick.GameContainer;


public class GameOver extends State {

    @Override
    public void doAction(GameContainer gc, SimpleSlickGame sl, int i) {        
        gc.pause();
        
    }

    
    
}
