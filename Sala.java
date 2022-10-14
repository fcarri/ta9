package project9_6;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Sala {
	private int id;
	private String[][] sala;
	private Pelicula pelicula;
	private int precio;

	public Sala(int id, Pelicula pelicula, int precio) {
		super();
		this.id = id;
		this.pelicula = pelicula;
		this.precio = precio;
		this.sala = cargarSala();
	}

	public String[][] cargarSala() {
		String[][] aux = { { "O8A", "O8B", "O8C", "O8D", "O8E", "O8F", "O8G", "O8H", "O8I" },
				{ "O7A", "O7B", "O7C", "O7D", "O7E", "O7F", "O7G", "O7H", "O7I" },
				{ "O6A", "O6B", "O6C", "O6D", "O6E", "O6F", "O6G", "O6H", "O6I" },
				{ "O5A", "O5B", "O5C", "O5D", "O5E", "O5F", "O5G", "O5H", "O5I" },
				{ "O4A", "O4B", "O4C", "O4D", "O4E", "O4F", "O4G", "O4H", "O4I" },
				{ "O3A", "O3B", "O3C", "O3D", "O3E", "O3F", "O3G", "O3H", "O3I" },
				{ "O2A", "O2B", "O2C", "O2D", "O2E", "O2F", "O2G", "O2H", "O2I" },
				{ "O1A", "O1B", "O1C", "O1D", "O1E", "O1F", "O1G", "O1H", "O1I" } };
		return aux;
	}

	// funcion que asigna el asiento a los clientes, controla la edad y el dinero
	// disponible;
	// si el cliente es apto para ver la pelicula y encuentra lugar se le asigna el
	// asiento
	// se le sustrae el dinero y cambia el estado de libre(0) a ocupado(X)
	public void asignar(ArrayList<Cliente> clientes, int pelicula) {
		// el primer for itera entre clientes y se asegura que el cliente tenga la edad
		// y el dinero
		System.out.println("Informacion de control precio:" + precio + " | edad minima: " + pelicula);
		System.out.println("Esta info es para que vea el reusltado del control de edad y precio");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNombre() + " | " + (cliente.getDinero() >= precio && cliente.getEdad() >= pelicula)+
					" | " + cliente.getDinero() + "$ | edad:" + cliente.getEdad());
			if (cliente.getDinero() >= precio && cliente.getEdad() >= pelicula) {
				asignarClientes(cliente);
			}
		}

	}

	// itera sobre las columnas si encuentra un lugar
	public void asignarClientes(Cliente cliente) {
		for (int i = 0; i < sala.length; i++) {
			if(finalizarAsignacion(cliente, i)) {
				break;
			}
		}
	}
	//itera sobre las filas para ver si existe un lugar libre si existe lo asigna y devuelve true;
	public boolean finalizarAsignacion(Cliente cliente, int i) {
		for (int j = 0; j < sala.length - 1; j++) {
			String aux = String.valueOf(sala[i][j].charAt(0));
			if (aux.equals("O")) {
				sala[i][j] = " X" + sala[i][j].substring(1, 3);
				cliente.setAsiento(sala[i][j]);
				cliente.setDinero(cliente.getDinero() - this.precio);
				return true;
			}
		}
		return false;
	}

	public String imprimirSala(Pelicula pelicula) {
		String aux = "| " + pelicula.getTitulo() + " | \n" + "| Director: " + pelicula.getDirector() + " | \n"
				+ "| Duración: " + (pelicula.getDuracion() / 60) + "hs | Precio:" + precio + "$ | +"
				+ pelicula.getEdad() + " | \n";
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala.length - 1; j++) {
				aux += "| " + sala[i][j];
			}
			aux += " | \n";
		}
		return aux;
	}
}
