package fabrica.abstrata.botoes;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonOkWithIcon extends JButton implements ButtonOk{

	@Override
	public JButton createButtonOk() {
		JButton ok = new JButton();
        ok.setText("OK");

        Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("/Ok-icon.png"));
        } catch (IOException ex) {
            Logger.getLogger(ButtonCancelWithoutIcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        ok.setIcon(new ImageIcon(img));
		return ok;
	}

}
