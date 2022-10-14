package project9_51;

public class Profesor {
	private String nombre;
	private int edad;
	private boolean SEXO;
	private String MATERIA;
	private boolean disponible;

	public Profesor(String nombre, int edad, boolean sEXO, String mATERIA) {
		this.nombre = nombre;
		this.edad = edad;
		this.SEXO = sEXO;
		this.MATERIA = mATERIA;
	}

	public Profesor(boolean disponible) {
		this.disponible = disponible;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isSEXO() {
		return SEXO;
	}

	public String getMATERIA() {
		return MATERIA;
	}

	public boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void disponible() {
		this.disponible = ((Math.random() * 10 + 1) > 2) ? true : false;
	}
}
