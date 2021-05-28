package fabrica.abstrata.botoes;


public class ButtonWithoutIcon extends FabricaAbstrataBotoes {

	@Override
	public ButtonOk criaBotaoOK() {
		return new ButtonOkWithoutIcon();
	}

	@Override
	public ButtonCancel criaBotaoCancel() {
		return new ButtonCancelWithoutIcon();

	}

}
