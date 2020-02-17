package edu.elsmancs.cotxox.tarifa;

import edu.elsmancs.cotxox.carrera.Carrera;

public class Tarifa {
	private final double costeMilla = 1.35;
	private final double costeMinuto = 0.35;
	private final double costeMinimo = 5.0;
	private final double porcentajeComision = 20.0;
	
	private double getCosteDistancia(double distancia) {
		return distancia * this.costeMilla;
		
	}
	
	private double getCosteTiempo(double tiempo) {
		return tiempo * this.costeMinuto;
	}
	
	public double getCosteTotalEsperado(Carrera carrera) {
		double distanciaCoste = this.getCosteDistancia(carrera.getDistancia());
		double tiempoCoste = this.getCosteTiempo(carrera.getTiempoEsperado());
		double costeEsperado = distanciaCoste + tiempoCoste;
		return costeEsperado >= costeMinimo? costeEsperado : 5.0;
	}
	
	
}
