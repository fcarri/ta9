package project9_6;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppCine {
	public void ejecutar() {
		JOptionPane.showMessageDialog(null, "App 6 Cine");
		ArrayList<Cliente> clientes = listaClientes();
		Pelicula pelicula = new Pelicula("The Batman","Matt Reeves", 16, 153.6);
		Sala sala1 = new  Sala(1,pelicula,10);
		sala1.asignar(clientes, pelicula.getEdad());
		JOptionPane.showMessageDialog(null, sala1.imprimirSala(pelicula) + "\n "
				+"Lugares ocupados ej(X8A) Lugares Vacios (O8A) \n"
				+" mas data en la consola puede ver los nombres alertorios y si pasaron la prueba de la edad y coste");
		
	}
	
	//se generan clientes alertorios desde 20 a 90 capacidad maxima del cine 72;
	public ArrayList<Cliente> listaClientes(){
		ArrayList<Cliente> clientes = new ArrayList<>();
		int aux = (int)(Math.random() *80 +20);
		System.out.println("Cantidad de clientes que quisieron asistir a la pelicula: " + aux);
		for (int i = 0; i < aux; i++) {
			clientes.add(new Cliente(nombre(),(int)(Math.random() *40 +5),(int)(Math.random()*80)));
		}
		return clientes;
	}
	
	//nombres y apellidos alertorios
	public String nombre() {
		String[] nombre = {"Joseph",
				"Robert","Roberta",
				"Kyle","Kyla",
				"Antonio","Antonia",
				"Louis","Louisa",
				"Stephan","Stephania","Stephanie",
				"Brian","Brianna",
				"George","Georgia",
				"Felix","Felicia",
				"Claude","Claudia",
				"Alexander","Alexandra",
				"Eric","Erica,"};
		String[] apellido = {
				"Garcia","Rodriguez","Gonzalez","Fernandez","Lopez","Martinez","Sanchez","Perez",
				"Gomez","Martin"};
				int a2 = (int)(Math.random() *9+1);
				int a1 = (int)(Math.random() *23+1);
		
		return nombre[a1] + " " +apellido[a2];
	}
}
