package niveles.fabricas;

import entidades.personajes.infectados.Infectado;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossBeta;
import logica.Juego;
import niveles.Nivel;

public class Nivel2InfectadosBeta extends FabricaDeTandas {
	

	public Nivel2InfectadosBeta(Juego j, Nivel nivel) {
		super(j, nivel, 10);

	}

	@Override
	public void primeraTanda() {
		Infectado beta = new InfectadoBeta(juego);
		crearTanda(cantidadInfectados, beta, 5, (cantidadInfectados/2)*beta.getImagen().getIconHeight());
	}

	@Override
	public void segundaTanda() {
		Infectado beta = new InfectadoBeta(juego);
		crearTanda(cantidadInfectados*2, beta, 5, cantidadInfectados*beta.getImagen().getIconHeight());
	}

	@Override
	public void elJefe() {	
		crearTanda(1, new InfectadoBossBeta(juego), 9, 1);
	}
}
