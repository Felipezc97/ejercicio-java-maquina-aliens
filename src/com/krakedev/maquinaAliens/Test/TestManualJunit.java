package com.krakedev.maquinaAliens.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	
	@Test
	void validaAgregarBrazosYPies() {
		Alien alien4 = new Alien(20, "rojo");
		boolean resultado1 = alien4.agregarBrazos(3);
		assertTrue(resultado1);
		
		Alien alien5 = new Alien(15, "blanco");
		boolean resultado2 = alien5.agregarPies(8);
		assertTrue(resultado2);
		
		boolean resultado3 = alien5.agregarBrazos(1);
		assertTrue(resultado3);
		
		boolean resultado4 = alien5.agregarBrazos(7);
		assertFalse(resultado4);
		
		boolean resultado5 = alien5.agregarPies(5);
		assertFalse(resultado5);	
	}
	
	@Test
	void validaAgregarOjos() {
		Alien alien6 = new Alien(7, "celeste");
		boolean resultado1 = alien6.agregarOjos(3);
		assertTrue(resultado1);
		boolean resultado2 = alien6.agregarOjos(3);
		assertFalse(resultado2);
		
		Alien alien7 = new Alien(16, "cafe");
		boolean resultado3 = alien7.agregarOjos(3);
		assertTrue(resultado3);
		boolean resultado4 = alien7.agregarOjos(3);
		assertFalse(resultado4);
		
		Alien alien8 = new Alien(28, "cafe");
		boolean resultado5 = alien8.agregarOjos(3);
		assertTrue(resultado5);
		boolean resultado6 = alien8.agregarOjos(3);
		assertTrue(resultado6);
	}

}
