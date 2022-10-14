package project9_6;

public class Cliente {
	private String nombre;
	private int edad;
	private int dinero;
	private String asiento;
	
	public Cliente(String nombre, int edad, int dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public int getDinero() {
		return dinero;
	}
	
	public int getEdad() {
		return edad;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public void setDinero(int d) {
		this.dinero = d;
	}
}
	
	
