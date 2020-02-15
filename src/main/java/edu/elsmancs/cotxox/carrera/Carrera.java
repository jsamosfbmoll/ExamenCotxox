package edu.elsmancs.cotxox.carrera;

import edu.elsmancs.cotxox.conductores.Conductor;
import edu.elsmancs.cotxox.conductores.PoolConductores;
import edu.elsmancs.cotxox.tarifa.Tarifa;

public class Carrera {
	
	private String tarjetaCredito = "";
	private String origen;
	private String destino = "";
	private double distancia = 0.0;
	private int tiempoEsperadoMinutos = 0;
	private double costeTotal = 0.0;
	private Conductor conductor;
	private double propina = 0.0;

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
		this.propina += 1;
	}
	
	public double getPropina() {
		return this.propina;
	}
	
	public double getCosteTotal() {
		return this.costeTotal;
	}

	public void asignarConductor(PoolConductores conductores) {
		conductor = conductores.asignarConductor();
	}
	
	public Conductor getConductor() {
		return this.conductor;
	}

	public void liberarConductor() {
		this.conductor.setOcupado(false);
		//this.conductor = null;
		//No sé si es necesario poner el conductor como null
	}
}
