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
	private double precioTotal;
	
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
		this.precioTotal = 0.0;
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
	
	public double getPrecioTotal() {
		return precioTotal;
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
	
	public void imprimir2() {
		System.out.println("tamanio: " + tamanio + ", color: " + color);
	}
	
	public void imprimir3() {
		System.out.println("tamanio: " + tamanio + ", color: " + color + ", numeroOjos: " + numeroOjos + ", numeroBrazos: "
				+ numeroBrazos + ", numeroPies: " + numeroPies);
	}
	
	private int contarExtremidadesTotales() {
		return this.numeroBrazos + this.numeroPies;
	}
	
	public boolean agregarBrazos(int brazosAgregados) {
		if (contarExtremidadesTotales() + brazosAgregados <= 10) {
			this.numeroBrazos += brazosAgregados;
			calcularPrecioTotal();
			return true;
		}
		return false;
	}
	
	public boolean agregarPies(int piesAgregados) {
		if (contarExtremidadesTotales() + piesAgregados <= 10) {
			this.numeroPies += piesAgregados;
			calcularPrecioTotal();
			return true;
		}
		return false;
	}

	public boolean agregarOjos(int ojosAgregados) {
		int limitePermitido = 0;
		if (this.tamanio <= 10) {
			limitePermitido = 3;
		} else if (this.tamanio > 10 && this.tamanio <= 20) {
			limitePermitido = 5;
		} else {
			limitePermitido = 7;
		}
		
		if (this.numeroOjos + ojosAgregados <= limitePermitido) {
			this.numeroOjos += ojosAgregados;
			calcularPrecioTotal();
			return true;
		}
		return false;
	}
	
	public void calcularPrecioTotal() {
		double precioTotal = 0.0;
		precioTotal = this.precioCuerpo
				+ this.numeroBrazos * this.precioExtremidad
				+ this.numeroPies * this.precioExtremidad
				+ this.numeroOjos * this.precioOjo;
		this.precioTotal = precioTotal;
	}
	

}
