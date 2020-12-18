package niveles.fabricas;


import entidades.personajes.infectados.Infectado;
import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;
import logica.Juego;
import niveles.Nivel;

public class Nivel3InfectadosMixto extends FabricaDeTandas {

	public Nivel3InfectadosMixto(Juego j,Nivel nivel) {
		super(j,nivel,10);
	}



	@Override
	public void primeraTanda() {
		Infectado alpha = new InfectadoAlpha(juego);
		Infectado beta = new InfectadoBeta(juego);
		crearTanda(cantidadInfectados, alpha, 4, cantidadInfectados*alpha.getImagen().getIconHeight());
		crearTanda(cantidadInfectados, beta, 5, cantidadInfectados*beta.getImagen().getIconHeight());
	}

	@Override
	public void segundaTanda() {
		Infectado alpha = new InfectadoAlpha(juego);
		Infectado beta = new InfectadoBeta(juego);
		crearTanda(cantidadInfectados*2, alpha, 4, cantidadInfectados*2*alpha.getImagen().getIconHeight());
		crearTanda(cantidadInfectados*2, beta, 5, cantidadInfectados*2*beta.getImagen().getIconHeight());
	}

	@Override
	public void elJefe() {
		crearTanda(1, new InfectadoBossAlpha(juego), 9, 1);
		crearTanda(1, new InfectadoBossBeta(juego), 9, 1);
		
	}
}
