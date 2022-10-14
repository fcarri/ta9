package project9_6;

public class Pelicula {
	private String titulo;
	private String director;
	private int edad;
	private double duracion;
	
	public Pelicula(String titulo, String director, int edad, double duracion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.edad = edad;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDirector() {
		return director;
	}

	public int getEdad() {
		return edad;
	}

	public double getDuracion() {
		return duracion;
	}
	
	
}
