package edu.elsmancs.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

	private final String nombre;
	private String modelo = "";
	private String matricula = "";
	private double valoracionMedia = 0;
	private final ArrayList<Byte> valoraciones = new ArrayList<Byte>();
	
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
		int sumaValoraciones = 0;
		for (byte valoracion : this.valoraciones) {
			sumaValoraciones += valoracion;
		}
		this.valoracionMedia = sumaValoraciones / this.valoraciones.size();
	}

	public void setValoracion(byte valoracion) {
		this.valoraciones.add(valoracion);
		this.calcularValoracionMedia();
	}
}
