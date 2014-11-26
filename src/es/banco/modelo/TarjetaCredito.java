package es.banco.modelo;

public class TarjetaCredito {
	private int id;
	private int numero;
	private int cupoMaximo;
	private int cupoDisponible;
	private boolean tipoTarjeta;
	private int numeroComprobacion;
	private int contraseña;
	
	
	//contructores
	public TarjetaCredito(int id, int numero, int cupoMaximo,
			int cupoDisponible, boolean tipoTarjeta, int numeroComprobacion,
			int contraseña) {
		super();
		this.id = id;
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contraseña = contraseña;
	}


	public TarjetaCredito(int numero, int cupoMaximo, int cupoDisponible,
			boolean tipoTarjeta, int numeroComprobacion, int contraseña) {
		super();
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contraseña = contraseña;
	}


	public TarjetaCredito() {
		super();
	}
	
	
	//getters y setters
	
	

}
