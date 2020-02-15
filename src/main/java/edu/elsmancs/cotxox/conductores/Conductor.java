package edu.elsmancs.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

	private final String nombre;
	private String modelo = "";
	private String matricula = "";
	private double valoracionMedia = 0;
	private final ArrayList<Byte> valoraciones = new ArrayList<Byte>();
	private boolean ocupado = false;
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	private void calcularValoracionMedia() {
		double sumaValoraciones = 0;
		for (byte valoracion : this.valoraciones) {
			sumaValoraciones += valoracion;
		}
		this.valoracionMedia = sumaValoraciones / this.valoraciones.size();
	}

	public String getNombre() {
		return nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getValoracion() {
		return valoracionMedia;
	}
	
	public boolean isOcupado() {
		return this.ocupado;
	}

	public void setValoracion(byte valoracion) {
		this.valoraciones.add(valoracion);
		this.calcularValoracionMedia();
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
