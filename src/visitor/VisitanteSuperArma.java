package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.premios.temporales.SuperArma;

public class VisitanteSuperArma extends Visitante {
	
	private SuperArma superArma;
	
	public VisitanteSuperArma(SuperArma sa) {
		this.superArma = sa;
	}

	@Override
	public void visitarJugador(Jugador j) {
		//pudo haberse hecho directamente con j
		superArma.ejecutar();
		superArma.detenerse();
		superArma.desaparecer();
	}

}
