package es.banco.modelo;

public class TarjetaCredito {
	private int id;
	private static String numero;
	private String cupoMaximo;
	private String cupoDisponible;
	private static boolean tipoTarjeta;
	private static String numeroComprobacion;
	private static String contraseña;
	private static String cantidadIngresar;
	private static String cantidadPagar;
	private static String cantidadRetirar;
	
	
	//contructores
	public TarjetaCredito(int id, String numero, String cupoMaximo,
			String cupoDisponible, boolean tipoTarjeta,
			String numeroComprobacion, String contraseña,
			String cantidadIngresar, String cantidadPagar,
			String cantidadRetirar) {
		super();
		this.id = id;
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contraseña = contraseña;
		this.cantidadIngresar = cantidadIngresar;
		this.cantidadPagar = cantidadPagar;
		this.cantidadRetirar = cantidadRetirar;
	}


	public TarjetaCredito(String numero, String cupoMaximo,
			String cupoDisponible, boolean tipoTarjeta,
			String numeroComprobacion, String contraseña,
			String cantidadIngresar, String cantidadPagar,
			String cantidadRetirar) {
		super();
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contraseña = contraseña;
		this.cantidadIngresar = cantidadIngresar;
		this.cantidadPagar = cantidadPagar;
		this.cantidadRetirar = cantidadRetirar;
	}


	public TarjetaCredito() {
		super();
	}


	
	
	//getters y setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCupoMaximo() {
		return cupoMaximo;
	}


	public void setCupoMaximo(String cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}


	public String getCupoDisponible() {
		return cupoDisponible;
	}


	public void setCupoDisponible(String cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}


	public static boolean isTipoTarjeta() {
		return tipoTarjeta;
	}


	public void setTipoTarjeta(boolean tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}


	public static String getNumeroComprobacion() {
		return numeroComprobacion;
	}


	public void setNumeroComprobacion(String numeroComprobacion) {
		this.numeroComprobacion = numeroComprobacion;
	}


	public static String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public static String getCantidadIngresar() {
		return cantidadIngresar;
	}


	public void setCantidadIngresar(String cantidadIngresar) {
		this.cantidadIngresar = cantidadIngresar;
	}


	public static String getCantidadPagar() {
		return cantidadPagar;
	}


	public void setCantidadPagar(String cantidadPagar) {
		this.cantidadPagar = cantidadPagar;
	}


	public static String getCantidadRetirar() {
		return cantidadRetirar;
	}


	public void setCantidadRetirar(String cantidadRetirar) {
		this.cantidadRetirar = cantidadRetirar;
	}
	
	

	
	
	

}
