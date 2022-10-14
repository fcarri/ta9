package project9_2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppSerie {
	DBserie db = new DBserie();
	ArrayList<Serie> listSeries = db.Serie();
	ArrayList<VideoJuego> listVideoJuegos = db.VideoJuego();
	Serie serie = new Serie();
	VideoJuego videoJuego = new VideoJuego();
	boolean flag;

	public void ejecutar() {
		JOptionPane.showMessageDialog(null, "App 2 Series");
		do {
			JOptionPane.showMessageDialog(null, "Todas las series disponibles");
			serie.showAll(listSeries);
			JOptionPane.showMessageDialog(null, "Comparamos dos series (en este caso alertorias) \n"
					+ serie.compareTo(serie.randomSerie(listSeries), serie.randomSerie(listSeries)));
			serie = serie.masLarga(listSeries);
			JOptionPane.showMessageDialog(null, "La serie con mas tempradas es: " + serie.toString());
			JOptionPane.showMessageDialog(null, "Video Juegos");
			JOptionPane.showMessageDialog(null, "Todos los Video Juegos disponibles");
			videoJuego.showAll(listVideoJuegos);
			JOptionPane.showMessageDialog(null,
					"Comparamos dos VideoJuegos (en este caso alertorias) \n"
							+ videoJuego.compareTo(videoJuego.randomVideoJuego(listVideoJuegos),
									videoJuego.randomVideoJuego(listVideoJuegos)));
			videoJuego = videoJuego.masLargo(listVideoJuegos);
			JOptionPane.showMessageDialog(null, "La serie con mas tempradas es: " + videoJuego.toString());
			int auxFlag = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese 1 para repetir la muestra 2 para salir"));
			flag = (auxFlag == 1) ? true : false;
		} while (flag);
	}
}
