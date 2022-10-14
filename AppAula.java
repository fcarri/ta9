package project9_51;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppAula {
	public void ejecutar() {
		JOptionPane.showMessageDialog(null, "App 4 Aula");
		Aula aula = new Aula(1, 15, "matematica");
		Alumno alumno = new Alumno();
		if (aula.clase(listaAlumnos(), listaProfesores())) {
			JOptionPane.showMessageDialog(null,
					"El profesor asistira a clases y la cantidad de alumnos es mayor al 50% (" + aula.getMateria()
							+ ")");
			JOptionPane.showMessageDialog(null,"Materia: "+ aula.getMateria() +"\n"+ alumno.aprobados(aula.getMateria(), listaAlumnos()));
		} else {
			JOptionPane.showMessageDialog(null, "Materia: "+ aula.getMateria() +"\n"+ alumno.aprobados(aula.getMateria(), listaAlumnos()));
		}
		alumno.todosLosAlumnos(listaAlumnos());
	}

	// retoran la lista de alumnos de la "DATABASE"
	public ArrayList<Alumno> listaAlumnos() {
		ArrayList<Alumno> alumnos = new ArrayList<>();
		alumnos.add(new Alumno("Alvaro", 17, true, 8, 6, 7));
		alumnos.add(new Alumno("Juana", 17, false, 9, 4, 8));
		alumnos.add(new Alumno("Juan", 18, true, 3, 4, 5));
		alumnos.add(new Alumno("Roberto", 16, true, 9, 9, 10));
		alumnos.add(new Alumno("carla", 17, false, 6, 7, 5));
		alumnos.add(new Alumno("Pablo", 18, true, 5, 8, 8));
		alumnos.add(new Alumno("Melba", 18, false, 6, 8, 8));
		alumnos.add(new Alumno("Leonidas", 17, true, 10, 10, 10));
		alumnos.add(new Alumno("Fiona", 17, false, 4, 10, 5));
		alumnos.add(new Alumno("Carlos", 16, true, 6, 8, 8));
		alumnos.add(new Alumno("Ana", 18, false, 6, 8, 8));
		return alumnos;
	}

	// retorna la lista de profesores de la "DATABASE"
	public ArrayList<Profesor> listaProfesores() {
		ArrayList<Profesor> profesores = new ArrayList<>();
		profesores.add(new Profesor("Raul", 25, true, "matematica"));
		profesores.add(new Profesor("Marta", 46, false, "filosofia"));
		profesores.add(new Profesor("Julieta", 30, false, "fisica"));
		return profesores;
	}
}
