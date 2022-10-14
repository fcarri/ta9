package project9_51;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Alumno {
	private String nombre;
	private int edad;
	private boolean sexo;
	private boolean disponibilidad;
	private int matematicas;
	private int filosofia;
	private int fisica;

	public Alumno() {
	}

	public Alumno(String nombre, int edad, boolean sEXO, int matematicas, int filosofia, int fisica) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sEXO;
		this.matematicas = matematicas;
		this.filosofia = filosofia;
		this.fisica = fisica;
	}

	public int getMatematicas() {
		return matematicas;
	}

	public void setMatematicas(int matematicas) {
		this.matematicas = matematicas;
	}

	public int getFilosofia() {
		return filosofia;
	}

	public void setFilosofia(int filosofia) {
		this.filosofia = filosofia;
	}

	public int getFisica() {
		return fisica;
	}

	public void setFisica(int fisica) {
		this.fisica = fisica;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isSEXO() {
		return sexo;
	}

	public boolean isDisponibildad() {
		return disponibilidad;
	}

	public void setDisponibildad(boolean disponibildad) {
		this.disponibilidad = disponibildad;
	}

	// carga la dispibilidad con una probabilidad del 50%
	public void disponible() {
		this.disponibilidad = ((Math.random()*10+1) >5)?true:false;
	}

	@Override
	public String toString() {
		String sex;
		if(sexo) {sex = "Masculino";}else {sex = "Femenino";}
		return "Alumno nombre= " + nombre + ", edad= " + edad + ", SEXO= " + sex + ", Matematicas= " + matematicas
				+ ", Filosofia= " + filosofia + ", Fisica= " + fisica ;
	}

	// recibe una lista de alumnos y la materia y devuelve un string con todos los
	// alumnos aprobados
	// y discriminados por sexo;
	public String aprobados(String materia, ArrayList<Alumno> alumnos) {
		String hombres = "";
		String mujeres = "";
		for (Alumno alumno : alumnos) {
			if (alumno.isSEXO()) {
				switch (materia) {
				case "matematica":
					hombres += (alumno.getMatematicas() > 5) ? (alumno.toString() + "\n") : "";
					break;
				case "filosofia":
					hombres += (alumno.getMatematicas() > 5) ? (alumno.toString() + "\n") : "";
					break;
				case "fisica":
					hombres += (alumno.getMatematicas() > 5) ? (alumno.toString() + "\n") : "";
					break;
				default:
					break;
				}
			} else {
				switch (materia) {
				case "matematica":
					mujeres += (alumno.getMatematicas() > 5) ? (alumno.toString() + "\n") : "";
					break;
				case "filosofia":
					mujeres += (alumno.getMatematicas() > 5) ? (alumno.toString() + "\n") : "";
					break;
				case "fisica":
					mujeres += (alumno.getMatematicas() > 5) ? (alumno.toString() + "\n") : "";
					break;
				default:
					break;
				}
			}
		}
		return "Hombres aprobados: \n" + hombres + "\n \n" + "Mujeres aprobados: \n" + mujeres;
	}
	
	public void todosLosAlumnos(ArrayList<Alumno> alumnos) {
		String s = "Alumnos: \n";
		for (Alumno alumno : alumnos) {
			s += alumno + "\n";
		}
		JOptionPane.showMessageDialog(null, s);
	}
}
