package project9_51;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aula {
	private int id;
	private int capacidad;
	private String materia;

	public Aula(int id, int capacidad, String materia) {
		this.id = id;
		this.capacidad = capacidad;
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	// responde si hay clase o no retorna true si hay clase si se cumplen los
	// requisitos minimos;
	public boolean clase(ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores) {
		Profesor p = profesorDisponible(materia, profesores);
		if (p.getDisponible() || alumnos.size() >= capacidad) {
			int asistencia = 0;
			for (Alumno alumno : alumnos) {
				alumno.disponible();
				asistencia += (alumno.isDisponibildad()) ? 1 : 0;
			}
			if (asistencia >= (alumnos.size() / 2)) {
				return true;
			} else {
				JOptionPane.showMessageDialog(null,
						"La cantidad de alumnos es menor al 50% la clase de " + materia + " se cancela");
				return false;
			}

		} else {
			if (p.getDisponible()) {
				JOptionPane.showMessageDialog(null,
						"La capacidad del aula no alcanza para la clase de " + materia + " se cancela");
			}
			JOptionPane.showMessageDialog(null,
					"El profesor no esta disponible la clase de " + materia + " se cancela");
			return false;
		}

	}

	// busca en la lista de profesores si hay un profesor disponible para la materia
	// deseada;
	public Profesor profesorDisponible(String materia, ArrayList<Profesor> p) {
		for (Profesor profesor : p) {
			profesor.disponible();
			System.out.println(profesor.getDisponible());
			if (profesor.getMATERIA().equals(materia) && profesor.getDisponible()) {
				
				return profesor;
			}
		}
		return new Profesor(false);
	}

}
