package project9_1;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	final int cargaPorDefecto = 5;
	
	public Lavadora() {
		super();
		this.carga = cargaPorDefecto;
	}
	
	public Lavadora(int carga) {
		super();
		this.carga = carga;
	}

	public Lavadora(int carga, double peso) {
		super();
		this.peso = peso;
		this.carga = carga;
	}

	public Lavadora(double precioBase, String color, String consumoE, double peso, int carga) {
		super(precioBase, color, consumoE, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public double precioFinalLavadora() {
		if(carga > 30) {
		return  30;	
		}
		return 0;
	}

	@Override
	public String toString() {
		return "\nLavadora carga= " + carga + ", cargaPorDefecto= " + cargaPorDefecto + ", precio= " + precio
				+ ", color= " + color + ", consumoE= " + consumoE + ", peso= " + peso;
	}
	
	
	
}