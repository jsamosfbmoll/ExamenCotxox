package edu.elsmancs.cotxox.carrera;

import edu.elsmancs.cotxox.tarifa.Tarifa;

public class Carrera {
	
	private String tarjetaCredito = "";
	private String origen;
	private String destino = "";
	private double distancia = 0.0;
	private int tiempoEsperadoMinutos = 0;
	private double costeTotal = 0.0;

	public Carrera(String tarjetaDeCredito) {
		this.tarjetaCredito = tarjetaDeCredito;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public void setTiempoEsperado(int tiempoEsperadoMinutos) {
		this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
	}
	
	public int getTiempoEsperado() {
		return this.tiempoEsperadoMinutos;
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public double getDistancia() {
		return distancia;
	}
	
	public double getCosteEsperado() {
		Tarifa tarifa = new Tarifa();
		return tarifa.getCosteTotalEsperado(this);
	}
	
	public void realizarPago(double pago) {
		this.costeTotal = pago;
	}
	
	public void recibirPropina(double propina) {
		this.costeTotal += propina;
	}
}
