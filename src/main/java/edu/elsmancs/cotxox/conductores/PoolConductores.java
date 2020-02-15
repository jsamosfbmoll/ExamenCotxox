package edu.elsmancs.cotxox.conductores;

import java.util.ArrayList;

public class PoolConductores {
	
	private final ArrayList<Conductor> poolConductores;

	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}

	public Conductor asignarConductor() {
		for (Conductor conductor : this.poolConductores) {
			if (conductor != null) {
				conductor.setOcupado(true);
				return conductor;
			}
		}
		return null;
	}

}
