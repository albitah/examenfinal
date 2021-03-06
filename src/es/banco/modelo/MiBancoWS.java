package es.banco.modelo;

public interface MiBancoWS {

	public abstract int darAlta(String numero, String cupoMaximo,
			String cupoDisponible, boolean tipo, String numeroComprobacion,
			String contraseņa);

	public abstract String ingresar(String numero, String numeroComprobacion,
			String contraseņa, String cantidadIngresar);

	public abstract String retirar(String numero, String numeroComprobacion,
			String contraseņa, String cantidadRetirar);

	public abstract String pagar(String numero, String numeroComprobacion,
			String contraseņa, String cantidadPagar);

}