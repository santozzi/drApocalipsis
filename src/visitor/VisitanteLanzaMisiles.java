package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.premios.temporales.LanzaMisiles;

public class VisitanteLanzaMisiles extends Visitante {
	
	private LanzaMisiles lanzaMisiles;

	public VisitanteLanzaMisiles(LanzaMisiles lanzaMisiles) {
		this.lanzaMisiles = lanzaMisiles;
	}
	
	@Override
	public void visitarJugador(Jugador j) {
		//pudo haberse hecho directamente con j
		lanzaMisiles.ejecutar();
		lanzaMisiles.detenerse();
		lanzaMisiles.desaparecer();
	}

}
