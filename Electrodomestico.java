package project9_1;

public class Electrodomestico {
	
		protected double precio;
		protected Color color;
		protected ConsumoE consumoE;
		protected double peso;
		
		public Electrodomestico() {
			this.precio = 100.00;
			this.color = Color.BLANCO;
			this.consumoE = ConsumoE.F;
			this.peso = 5.00;
		}
		
		public Electrodomestico(double precioBase, double peso) {
			this.precio = precioBase;
			this.color = Color.BLANCO;
			this.consumoE = ConsumoE.F;
			this.peso = peso;
		}

		public Electrodomestico(double precioBase, String color, String c, double peso) {
			this.precio = precioBase;
			this.color = Color.carga(color);
			this.peso = peso;
			char consumo = c.charAt(0);
			this.consumoE = comprobarConsumoEnergetico(consumo);
			this.color = (Color.carga(color));
		}

		enum ConsumoE {A,B,C,D,F;

			private static ConsumoE carga(char s) {
				String ss = String.valueOf(s);
				ConsumoE aux = Enum.valueOf(ConsumoE.class, ss.toUpperCase());
				return aux;
			}
		}

		enum Color {
			BLANCO,NEGRO,ROJO,AZUL,GRIS;

			private static Color carga(String s) {
				Color aux = Enum.valueOf(Color.class, s.toUpperCase());
				return aux;
			}
		}
		
		public double getPrecioBase() {
			return precio;
		}

		public Color getColor() {
			return color;
		}

		public ConsumoE getConsumoE() {
			return consumoE;
		}

		public double getPeso() {
			return peso;
		}

		@Override
		public String toString() {
			return "\nprecioBase= " + precio + " color= " + color +
					" consumoE= " + consumoE + " peso= "
					+ peso ;
		}
		
		//comprueba si el consumo es correcto si no lo es lo deja en por defecto(F);
		public ConsumoE comprobarConsumoEnergetico(char c) {
			String aux = String.valueOf(c);
			aux = aux.toUpperCase();
			if(aux.equals("A")|| aux.equals("B")|| aux.equals("C") 
					|| aux.equals("D") || aux.equals("F")) {
				return ConsumoE.carga(c);
			}else {
				return ConsumoE.F;
			}
			}
			
			//comprueba si el color es correcto si no lo es lo deja en por defecto(BLANCO);
			public String comprobarColor(String s) {
				 s = s.toUpperCase();
				if(s.equals("BLANCO") || s.equals("ROJO") || s.equals("NEGRO") || s.equals("GRIS") || s.equals("AZUL")){
					return s;
				}
				return "BLANCO";
				}

			// el precio final depende del consumo energetico y del peso del mismo;
			public void precioFinal(Electrodomestico e) {
				this.precio = (precioLetra()+ precioPeso());
				if(e instanceof Television) {
					this.precio += ((Television) e).precioFinalTelevision();
				}else if(e instanceof Lavadora) {
					this.precio += ((Lavadora) e).precioFinalLavadora();
				}
				}
			
			public int precioLetra() {
				String[] letra = {"A","B","C","D","E","F"};
				int[] precio ={100,80,60,50,30,10};
				for (int i = 0; i < 6 ; i++) {
					String aux = consumoE.toString();
					if(aux.equals(letra[i])) {
						return (precio[i]);
					}
				}
				return 80;
			}
			
			public int precioPeso() {
				int[][] precio = {{80,50,20},
						{80,50,10}};
				int aux = 100;
				for (int i = 0; i == 2 ; i++) {
					aux = (this.peso < precio[i][0])?precio[1][i]:aux;
				}
				return aux;
			}
			
	
}
