package es.banco.modelo;

public class TarjetaCredito {
	private int id;
	private int numero;
	private int cupoMaximo;
	private int cupoDisponible;
	private boolean tipoTarjeta;
	private int numeroComprobacion;
	private int contraseņa;
	
	
	//contructores
	public TarjetaCredito(int id, int numero, int cupoMaximo,
			int cupoDisponible, boolean tipoTarjeta, int numeroComprobacion,
			int contraseņa) {
		super();
		this.id = id;
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contraseņa = contraseņa;
	}


	public TarjetaCredito(int numero, int cupoMaximo, int cupoDisponible,
			boolean tipoTarjeta, int numeroComprobacion, int contraseņa) {
		super();
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contraseņa = contraseņa;
	}


	public TarjetaCredito() {
		super();
	}
	
	
	//getters y setters
	
	

}
