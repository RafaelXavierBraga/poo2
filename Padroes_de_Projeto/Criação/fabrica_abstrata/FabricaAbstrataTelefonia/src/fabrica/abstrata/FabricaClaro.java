package fabrica.abstrata;

public class FabricaClaro extends FabricaAbstrataEnvios {

	@Override
	public Cobranca criaCobranca() {
		return new Cobran�aClaro();
		 
	}

	@Override
	public EnvioSMS criaEnvioSMS() {
		// TODO Auto-generated method stub
		return new EnvioSMSClaro();
	}

}
