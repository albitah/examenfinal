package es.banco.modelo;

public class TarjetaCredito {
	private int id;
	private int numero;
	private int cupoMaximo;
	private int cupoDisponible;
	private boolean tipoTarjeta;
	private int numeroComprobacion;
	private int contrase�a;
	
	
	//contructores
	public TarjetaCredito(int id, int numero, int cupoMaximo,
			int cupoDisponible, boolean tipoTarjeta, int numeroComprobacion,
			int contrase�a) {
		super();
		this.id = id;
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contrase�a = contrase�a;
	}


	public TarjetaCredito(int numero, int cupoMaximo, int cupoDisponible,
			boolean tipoTarjeta, int numeroComprobacion, int contrase�a) {
		super();
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipoTarjeta = tipoTarjeta;
		this.numeroComprobacion = numeroComprobacion;
		this.contrase�a = contrase�a;
	}


	public TarjetaCredito() {
		super();
	}
	
	
	//getters y setters
	
	

}
