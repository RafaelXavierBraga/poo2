package fabrica.abstrata.botoes;


public class ButtonWithIcon extends FabricaAbstrataBotoes{

	@Override
	public ButtonOk criaBotaoOK() {
		return new ButtonOkWithIcon();
	}

	@Override
	public ButtonCancel criaBotaoCancel() {
		return new ButtonCancelWithIcon();
	}

}
