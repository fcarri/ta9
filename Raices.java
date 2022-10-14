package project9_4;

import java.lang.Math;

public class Raices {
	
	protected double a;
	protected double b;
	protected double c;
	protected double discriminant;
	protected Boolean tieneDosSoluciones;
	protected Boolean tieneUnaSolucion;
		
	public Raices() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.discriminant = 0;
		this.tieneDosSoluciones = false;
		this.tieneUnaSolucion = false;
		
	}
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;						
	}
	
	public double getDiscriminant() {
		
		discriminant = (b * b) - (4*a* c);			
		return discriminant;
	}

	public Boolean tieneRaices() {		
		
		if (getDiscriminant() > 0) {
			tieneDosSoluciones = true;
		}else {
			tieneDosSoluciones = false;
		}
		
		return tieneDosSoluciones;
	}
	
	public Boolean tieneRaiz() {
		
		if (getDiscriminant() == 0) {
			tieneUnaSolucion = true;
		}else {
			tieneUnaSolucion = false;
		}
		
		return tieneUnaSolucion;
	}
	

	public void calcular() {
		
		Double discr = getDiscriminant();		
		
		if(tieneDosSoluciones == true) {
			System.out.println("Tiene dos soluciones");			
			obtenerRaices();
		}
		if(tieneUnaSolucion == true) {
			System.out.println("Tiene una solucion");
			obtenerRaiz();
		}
		if (discr < 0) {
			System.out.println("No tiene raices reales");
		}	
							
	}
	
	//dos raices reales
	public void obtenerRaices() {
		
		double discr = getDiscriminant();
		double x1 = (-b + Math.sqrt(discr)) / (2 * a);
		double x2 = (-b - Math.sqrt(discr)) / (2 * a);
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		
	}
	
	//una única raiz
	public void obtenerRaiz() {
		
		double discr = getDiscriminant();
		double x1 = (-b + Math.sqrt(discr)) / (2 * a);		
		System.out.println("x1 = x2 = "+x1);
				
	}

}
