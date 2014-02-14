package treto.model;

import java.util.ArrayList;
import java.util.List;

public class CD {

	private List<Musica> musicas = new ArrayList<Musica>();

	public int quantidadeDeMusicas() {
		// TODO Auto-generated method stub
		return musicas.size();
	}

	public void addMusica(Musica musica) {
		// TODO Auto-generated method stub
		this.musicas.add(musica);
	}

	public void addMusicas(List<Musica> musicas) {
		// TODO Auto-generated method stub
		this.musicas.addAll(musicas);
	}

}
