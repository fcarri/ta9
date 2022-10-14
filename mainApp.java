package project9_3;

public class mainApp {
	public static void main(String[] args) {		
				
		Libro lib1 = new Libro(10201,"Rama","Clarke",200);	
		Libro lib2 = new Libro(21221,"Lord of the Rings","Tolkien",800);	
		lib1.execute();
		lib2.execute();
		
		if(lib1.paginas > lib2.paginas){
			System.out.println("El libro "+lib1.titulo+" tiene mas paginas");
		} else {
			System.out.println("El libro "+lib2.titulo+" tiene mas paginas");
		}		
		
	}
}
