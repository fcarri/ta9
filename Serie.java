package project9_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Serie implements Entregable {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private Genero genero;
	private Genero subGenero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.temporadas = 3;
		this.entregado = false;
		this.genero = Genero.SIN_ASIGNAR;
		this.subGenero = Genero.SIN_ASIGNAR;
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = Genero.SIN_ASIGNAR;
		this.subGenero = Genero.SIN_ASIGNAR;
	}

	public Serie(String titulo, int temporadas, String genero, String subGenero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = Genero.carga(genero);
		this.subGenero = Genero.carga(subGenero);
		this.creador = creador;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Genero getSubGenero() {
		return subGenero;
	}

	public void setSubGenero(Genero subGenero) {
		this.subGenero = subGenero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	enum Genero {
		TERROR, SUSPENSO, ACCION, ROMANCE, COMEDIA, DRAMA, CIENCIA_FICCION, SIN_ASIGNAR;

		private static Genero carga(String s) {
			Genero aux = Enum.valueOf(Genero.class, s.toUpperCase());
			return aux;
		}
	}

	@Override
	public void entregado() {
		this.entregado = true;

	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public void isEntregado() {
		this.entregado = (this.entregado) ? false : true;

	}

	@Override
	public String toString() {
		return "|Titulo: |" + this.titulo + "|" + "\n" + "|Creador: |" + this.creador + "|" + "\n" + "|Temporadas: |"
				+ this.temporadas + "|" + "\n" + "|Genero: |" + this.genero + "|" + "\n" + "|SubGenero: |"
				+ this.subGenero + "|";
	}

	// compara este objeto con uno similar devuelve un string;
	// @Override
	public String compareTo(Serie s , Serie s2) {
		return "|Titulo: |" + s.getTitulo()+ "| |" + s2.getTitulo() + "\n" + "|Creador: |" + s.getCreador() + "| |"
				+ s2.getCreador() + "\n" + "|Temporadas: |" + s.getTemporadas() + "| |" + s2.getTemporadas() + "\n"
				+ "|Genero: |" + s.getGenero() + "| |" + s2.getGenero() + "\n" + "|SubGenero: |" + s.getSubGenero() + "| |"
				+ s2.getSubGenero() + "\n";
	}
	//recive una lista y la imprime;
	public void showAll(ArrayList<Serie> s) {
		String aux = "";
		for (Serie serie : s) {
			aux += serie.toString()+"\n" + "-------------------" +"\n";
		}
		JOptionPane.showMessageDialog(null, aux);
	}
	
	//devuelve una serie random;
	public Serie randomSerie(ArrayList<Serie> s) {
		while(true) {
		for (Serie serie : s) {
			if(Math.random()*11 > 5) {
				return serie;
			}
		}
		}
	}
	
	// devuelve la serie mas larga en tempradas;
	public Serie masLarga(ArrayList<Serie> s) {
		Serie aux = new Serie();
		aux.setTemporadas(0);
		for (Serie serie : s) {
			aux = (aux.getTemporadas() < serie.getTemporadas())?serie:aux;
		}
		return aux;
	}

}
