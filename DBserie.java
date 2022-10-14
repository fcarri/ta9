package project9_2;

import java.util.ArrayList;

public class DBserie {
	public ArrayList<Serie> Serie() {
		ArrayList<Serie> listSeries = new ArrayList<>();
		listSeries.add(new Serie("Breaking Bad",5,"drama","suspenso","Vince Gilligan"));
		listSeries.add(new Serie("Better Call Saul",6,"drama","suspenso","Vince Gilligan"));
		listSeries.add(new Serie("Rick and Morty",6,"CIENCIA_FICCION","COMEDIA","Justin Roiland y Dan Harmon"));
		listSeries.add(new Serie("Prision Break",5,"SUSPENSO","ACCION","Paul Scheuring"));
		listSeries.add(new Serie("Game of Thrones",10,"CIENCIA_FICCION","ACCION","George R. R. Martin"));
		for (Serie serie : listSeries) {
			serie.toString();
		}
	return listSeries;
	}
	
	public ArrayList<VideoJuego> VideoJuego(){
		ArrayList<VideoJuego> listVideoJuegos = new ArrayList<>();
		listVideoJuegos.add(new VideoJuego("CupHead",25,"Accion","FRENETICO","Indie"));
		listVideoJuegos.add(new VideoJuego("Batman Arkahm City",30,"Accion","MUNDO_ABIERTO","WarnerBros.game"));
		listVideoJuegos.add(new VideoJuego("FIFA2023",5,"DEPORTE","SIMULACION","ElectronicART"));
		listVideoJuegos.add(new VideoJuego("Need For Speed",60,"CARRERAS","SIMULACION","ElectronicART"));
		listVideoJuegos.add(new VideoJuego("FORZA",70,"CARRERAS","SIMULACION","EPIC GAMES"));
		return listVideoJuegos;
	}
	
}