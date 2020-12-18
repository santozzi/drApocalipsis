package niveles.fabricas;


import entidades.personajes.infectados.Infectado;
import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBossAlpha;
import logica.Juego;
import niveles.Nivel;

public class Nivel1InfectadosAlpha extends FabricaDeTandas{


	public Nivel1InfectadosAlpha(Juego j, Nivel nivel) {
		super(j, nivel, 10);
	}

	@Override 
	public void primeraTanda() {
		Infectado alpha = new InfectadoAlpha(juego);
		crearTanda(cantidadInfectados, alpha, 4, (cantidadInfectados/2)*alpha.getImagen().getIconHeight());
	}
	
	@Override
	public void segundaTanda() {
		Infectado alpha = new InfectadoAlpha(juego);
		crearTanda(cantidadInfectados*2, alpha, 4, cantidadInfectados*alpha.getImagen().getIconHeight());
	}
	
	@Override
	public void  elJefe() {
		crearTanda(1, new InfectadoBossAlpha(juego), 9, 1);
	}
	
}
