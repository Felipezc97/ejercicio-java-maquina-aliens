package com.krakedev.maquinaAliens;

public class Alien {
	
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	
	public Alien (int tamanio, String color) {
		if (tamanio < 5) {
			this.tamanio = 5;
		} else if (tamanio > 30) {
			this.tamanio = 30;
		} else {
			this.tamanio = tamanio;
		}
		this.color = color;
		
		this.precioCuerpo = 0.20 * this.tamanio;
		this.precioExtremidad = 0.10 * this.tamanio;
		this.precioOjo = 0.05 * this.tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	@Override
	public String toString() {
		return "tamanio=" + tamanio + "\ncolor=" + color + "\nnumeroOjos=" + numeroOjos + "\nnumeroBrazos="
				+ numeroBrazos + "\nnumeroPies=" + numeroPies + "\nprecioExtremidad=" + precioExtremidad
				+ "\nprecioOjo=" + precioOjo + "\nprecioCuerpo=" + precioCuerpo;
	}
	
	public void imprimir() {
		System.out.println("----------------------------");
		System.out.println(this.toString());
	}
	
	

}
