package treto.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import treto.model.CD;
import treto.model.Musica;

public class CDTest {

	@Test
	public void deveriaConterZeroMusicas() {
		CD cd = new CD();
		assertEquals(0,cd.quantidadeDeMusicas()); 
	}
	@Test
	public void deveriaConterUmaMusicas() {
		CD cd = new CD();
		Musica musica = new Musica("Faixa1");
		cd.addMusica(musica);
		assertEquals(1,cd.quantidadeDeMusicas()); 
	}
	@Test
	public void deveriaRetornarQuantidadeDeMusicas() {
		CD cd = new CD();
		Musica musica = new Musica("Faixa1");
		Musica musica1 = new Musica("Faixa2");
		List<Musica> musicas = new ArrayList<Musica>();
		musicas.add(musica);
		musicas.add(musica1);
		cd.addMusicas(musicas);
		assertEquals(2,cd.quantidadeDeMusicas()); 
	}
}
