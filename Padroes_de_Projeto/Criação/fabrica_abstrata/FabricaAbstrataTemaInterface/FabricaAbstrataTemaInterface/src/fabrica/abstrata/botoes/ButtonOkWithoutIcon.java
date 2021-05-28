package fabrica.abstrata.botoes;


import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class ButtonOkWithoutIcon  extends JButton implements ButtonOk{
    
	
	@Override
	public JButton createButtonOk() {
		JButton ok = new JButton();
        ok.setText("OK");
		return ok;
	}
    
}
