package es.banco.modelo;

import es.banco.integracion.TarjetaCreditoDAO;






public class MiBanco implements MiBancoWS {
	private TarjetaCreditoDAO tarjetacreditodao= new TarjetaCreditoDAO();
	private String cantidadIngresar;
	private String cantidadRetirar;
	private String cantidadPagar;
	private TarjetaCredito TarjetaCredito;
	
	/* (non-Javadoc)
	 * @see es.banco.modelo.MiBancoWS#darAlta(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String)
	 */
	@Override
	public int darAlta(String numero, String cupoMaximo, String cupoDisponible, boolean tipo, 
						String numeroComprobacion, String contraseña) {
		
		TarjetaCredito tarjeta= new TarjetaCredito(numero, cupoMaximo, cupoDisponible, tipo, numeroComprobacion, contraseña, cantidadIngresar, cantidadRetirar, cantidadPagar);
		int id= tarjetacreditodao.darAlta(tarjeta);
		
		return id;
	}

	public String noAlta() {
	String msg;
	msg="NO ES POSIBLE DAR DE ALTA ESTA TARJETA: TARJETA EXISTENTE";
		return msg;
	}



	/* (non-Javadoc)
	 * @see es.banco.modelo.MiBancoWS#ingresar(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String ingresar(String numero, String numeroComprobacion,
			String contraseña, String cantidadIngresar) {
		TarjetaCredito tarjeta= tarjetacreditodao.cantidadIngresar(cantidadIngresar);
		
		return cantidadIngresar;
	}
	
	public String noAdmitido() {
		String msg;
		msg="NO ES POSIBLE INGRESAR ESE DINERO";
			return msg;
		}
	
	/* (non-Javadoc)
	 * @see es.banco.modelo.MiBancoWS#retirar(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String retirar(String numero, String numeroComprobacion,
			String contraseña, String cantidadRetirar) {
			TarjetaCredito tarjeta= tarjetacreditodao.cantidadRetirar(cantidadRetirar);
		
		
		return cantidadRetirar;
	}
	
	public String noAdmitido2() {
		String msg;
		msg="NO ES POSIBLE RETIRAR ESE DINERO";
			return cantidadRetirar;
		}

	/* (non-Javadoc)
	 * @see es.banco.modelo.MiBancoWS#pagar(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String pagar(String numero, String numeroComprobacion,
			String contraseña, String cantidadPagar) {
		TarjetaCredito tarjeta= tarjetacreditodao.cantidadPagar(cantidadPagar);
		return cantidadPagar;
	}
	public String noAdmitido3() {
		String msg;
		msg="NO ES POSIBLE HACER ESE PAGO";
			return msg;
		}
	



}