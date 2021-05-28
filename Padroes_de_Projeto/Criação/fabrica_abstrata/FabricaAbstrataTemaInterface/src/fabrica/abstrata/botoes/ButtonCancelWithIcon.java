package fabrica.abstrata.botoes;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonCancelWithIcon extends JButton implements ButtonCancel{

	@Override
	public JButton createButtonCancel() {
		JButton cancel = new JButton();
        cancel.setText("OK");
        
        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("/Cancel-icon.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(ButtonCancelWithoutIcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        cancel.setIcon(new ImageIcon(img));	
        return cancel;	
	}
	
	
}
