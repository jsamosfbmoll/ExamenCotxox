package edu.elsmancs.cotxox.main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMain {

	Carrera carrera;

	@Before
	public void setup() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
	}

	@Test
	public void crearCarrera() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
	}

	@Test
	public void gettersCarrera() {
		assertEquals("4916119711304546", carrera.getTarjetaCredito());
		assertEquals("Aeroport Son Sant Joan", carrera.getOrigen());
		assertEquals("Magaluf", carrera.getDestino());
		assertEquals(7.75, carrera.getDistancia());
	}

}
