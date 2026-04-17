package com.krakedev.maquinaAliens.Test;

import com.krakedev.maquinaAliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		Alien alien1 = new Alien(3, "rojo");
		Alien alien2 = new Alien(15, "azul");
		Alien alien3 = new Alien(38, "blanco");
		
		alien1.imprimir();
		alien2.imprimir();
		alien3.imprimir();

	}

}
