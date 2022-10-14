package project9_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VideoJuego implements Entregable {

	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private Genero genero;
	private Genero subGenero;
	private String compania;

	public VideoJuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = Genero.SIN_ASIGNAR;
		this.subGenero = Genero.SIN_ASIGNAR;
		this.compania = "";
	}

	public VideoJuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = Genero.SIN_ASIGNAR;
		this.subGenero = Genero.SIN_ASIGNAR;
		this.compania = "";
	}

	public VideoJuego(String titulo, int horasEstimadas, String genero, String subGenero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = Genero.carga(genero);
		this.subGenero = Genero.carga(subGenero);
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
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

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	enum Genero {
		TERROR, SUSPENSO, ACCION, ROMANCE, COMEDIA, FRENETICO, MUNDO_ABIERTO, SIMULACION, DEPORTE, SIN_ASIGNAR,
		CARRERAS;

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
		return "|Titulo: |" + this.titulo + "|" + "\n" + "|Compañia: |" + "|" + "\n" + "|Horas Estimadas: |"
				+ this.horasEstimadas + "|" + "\n" + "|Genero: |" + this.genero + "|" + "\n" + "|SubGenero: |"
				+ this.subGenero + "|";
	}

	// @Override
	public String compareTo(VideoJuego vj, VideoJuego vj2) {
		return "|Titulo: |" + vj.getTitulo() + "| |" + vj2.getTitulo() + "| \n" + "|Compañia: |" + vj.getCompania()
				+ "| |" + vj2.getCompania() + "\n" + "|Horas Estimadas: |" + vj.getHorasEstimadas() + "| |"
				+ vj2.getHorasEstimadas() + "\n" + "|Genero: |" + vj.getGenero() + "| |" + vj2.getGenero() + "\n"
				+ "|SubGenero: |" + vj.getSubGenero() + "| |" + vj2.getSubGenero() + "\n";
	}

	// recive una lista de VideoJuego y devuelve la que mas horas estimadas tiene;
	public VideoJuego masLargo(ArrayList<VideoJuego> vj) {
		VideoJuego aux = new VideoJuego();
		aux.setHorasEstimadas(0);
		for (VideoJuego videoJuego : vj) {
			aux = (aux.getHorasEstimadas() < videoJuego.getHorasEstimadas()) ? videoJuego : aux;
		}
		return aux;
	}

	// devuelve un VideoJuego random;
	public VideoJuego randomVideoJuego(ArrayList<VideoJuego> vj) {
		while (true) {
			int alertorio = (int) (Math.random() * vj.size()) + 1;
			int aux = 0;
			for (VideoJuego videoJuego : vj) {
				if (aux == alertorio) {
					return videoJuego;
				}
				aux += 1;
			}
		}
	}
	
	//recive una lista y la imprime;
	public void showAll(ArrayList<VideoJuego> vj) {
		String aux = "";
		for (VideoJuego videoJuego: vj) {
			aux += videoJuego.toString() +"\n" + "-------------------" +"\n";
		}
		JOptionPane.showMessageDialog(null, aux);
	}
}


