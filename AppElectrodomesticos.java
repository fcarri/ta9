package project9_1;

import javax.swing.JOptionPane;

public class AppElectrodomesticos {
	public void ejecutar() {
		JOptionPane.showMessageDialog(null, "App 1 Electrodomesticos");
		Electrodomestico[] list = {
				new Electrodomestico(),new Television(),new Lavadora(),
				new Electrodomestico(350.5, "ROjo","a", 50),new Television(45,true),
				new Lavadora(80), new Television(100,"GRIS","a",20,60,true),
				new Lavadora(30,"Gris","b",85,60),new Television(50,"GRIS","a",5,25,false),
				new Lavadora(300,"Rojo","c",100,120)
		};
		double[] total = new double[3];
		String[] aux = new String[3];
		for (Electrodomestico el: list) {
			el.precioFinal(el);
			if(el instanceof Television) {
				aux[1] += el.toString();
				total[1] += el.precio;
			}else if(el instanceof Lavadora) {
				aux[2] += el.toString();
				total[2] += el.precio;
			}else {
				aux[0] += el.toString();
				total[0] += el.precio;
			}
			System.out.println(el.toString());
		}
			JOptionPane.showMessageDialog(null,"Electrodomesticos : "+"\n"+  aux[0] + "\n"+
		"Sub total Electrodomesticos = " + total[0] + "\n" +
		"Television : " +"\n"+ aux[1] + "\n"+ "Sub total Televisores = " + total[1] + "\n" + 
		"Lavadora : "+ "\n"+ aux[2] + "\n" + "Sub total Lavadoras = " + total[2] + "\n" +
		"Total a pagar = " + (total[0] + total[1] + total[2]));
	}
}
