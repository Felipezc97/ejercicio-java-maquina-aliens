package com.krakedev.maquinaAliens.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.maquinaAliens.Alien;

class TestManualJunit {
	
	@Test
	void validaAsignacionAtributosYPrecios() {
		Alien alien1 = new Alien(20, "verde");
		assertEquals(20, alien1.getTamanio());
		assertEquals("verde", alien1.getColor());
		assertEquals(4.0, alien1.getPrecioCuerpo(), 0.01);
		assertEquals(2.0, alien1.getPrecioExtremidad(), 0.01);
		assertEquals(1.0, alien1.getPrecioOjo(), 0.01);
	}
	
	@Test
	void validaRestriccionesTamaño() {
		Alien alien2 = new Alien(2, "azul");
		assertEquals(5, alien2.getTamanio());
		assertEquals("azul", alien2.getColor());
		assertEquals(1.0, alien2.getPrecioCuerpo(), 0.01);
		assertEquals(0.5, alien2.getPrecioExtremidad(), 0.01);
		assertEquals(0.25, alien2.getPrecioOjo(), 0.01);
		
		Alien alien3 = new Alien(48, "gris");
		assertEquals(30, alien3.getTamanio());
		assertEquals("gris", alien3.getColor());
		assertEquals(6.0, alien3.getPrecioCuerpo(), 0.01);
		assertEquals(3.0, alien3.getPrecioExtremidad(), 0.01);
		assertEquals(1.5, alien3.getPrecioOjo(), 0.01);
	}

}
