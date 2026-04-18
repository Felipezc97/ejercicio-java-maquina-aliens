package com.krakedev.maquinaAliens.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.krakedev.maquinaAliens.Alien;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class TestImprimirJunit {
	
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    void inicializar() {
    	// Se redirige la salida del System.out al capturador
    	System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @AfterEach
    void finalizar() {
    	// Se devuelve para que imprima los demas mensajes en consola
    	System.setOut(standardOut);
    }
    
	@Test
	@Order(1)
	@DisplayName("Valida el metodo imprimir 2 que muestra dos atributos")
	void validaMetodoImprimir2() {
		
		// Se instancia objeto alien y se llama al metodo imprimir
		Alien alien1 = new Alien(10,"blanco");
		alien1.imprimir2();
		String valorEsperadoConsola = "tamanio: 10, color: blanco";
		
		// Validamos el valor esperado con el valor que se capturo 
		assertEquals(valorEsperadoConsola, outputStreamCaptor.toString().trim());

	}
	
	@Test
	@Order(2)
	@DisplayName("Valida el metodo imprimir 3 que muestra 5 atributos")
	void validaMetodoImprimir3() {
		
		// Se instancia objeto alien y se llama al metodo imprimir
		Alien alien1 = new Alien(10,"blanco");
		alien1.imprimir3();
		String valorEsperadoConsola = "tamanio: 10, color: blanco, numeroOjos: 0, numeroBrazos: 0, numeroPies: 0";
		
		// Validamos el valor esperado con el valor que se capturo 
		assertEquals(valorEsperadoConsola, outputStreamCaptor.toString().trim());

	}
	
	
	
}
