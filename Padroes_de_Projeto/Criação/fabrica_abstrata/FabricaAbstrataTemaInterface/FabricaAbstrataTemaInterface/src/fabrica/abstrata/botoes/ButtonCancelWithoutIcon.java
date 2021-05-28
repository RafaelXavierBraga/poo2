package fabrica.abstrata.botoes;



import javax.swing.JButton;


/**
 *
 * @author felipe
 */
public class ButtonCancelWithoutIcon extends JButton implements ButtonCancel{
    
	@Override
	public JButton createButtonCancel() {
		JButton cancel = new JButton();
        cancel.setText("Cancel");
		return cancel;
	}
}
