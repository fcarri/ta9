package project9_3;

public class Libro {
	
	protected int ISBN;
	protected String titulo;
	protected String autor;
	protected int paginas;		
	
	public void execute() {		
		
		System.out.println(toString());						 		
	}	
				
	public Libro() {
		
		this.ISBN = 0;
		this.titulo = "";
		this.autor = "";
		this.paginas = 0;
	}
	
	public Libro(int ISBN, String titulo, String autor, int paginas) {
		
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public String toString() {
		
		return "El libro con ISBN "+ISBN+" creado por el autor "
		+ autor +" tiene " + paginas +" paginas";
	}
	
	
}
