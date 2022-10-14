package project9_1;

public class Television extends Electrodomestico{
	private int resolucion;
	private boolean tdt;
	public Television() {
		super();
		this.resolucion = 20;
		this.tdt = false;
	}
	public Television(int resolucion, boolean tdt) {
		super();
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	public Television(double precio, double peso) {
		super();
		this.resolucion = 20;
		this.tdt = false;
		this.precio = precio;
		this.peso = peso;
	}
	
	public Television(double precioBase, String color, String consumoE, double peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoE, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	public int getResolucion() {
		return resolucion;
	}
	
	public boolean getTdt() {
		return tdt;
	}
	
	public double precioFinalTelevision() {
		double p = 0;
		p = (tdt)? p+50:p;
		p = ((resolucion > 40)?p*1.4:p);
		return p;
	}
	@Override
	public String toString() {
		return "\nTelevision resolucion= " + resolucion + ", tdt= " + tdt + ", precio= " + precio + ", color= " + color
				+ ", consumoE= " + consumoE + ", peso= " + peso;
	}
	
	
}
