package visitor;

import entidades.personajes.jugador.Jugador;

public class VisitanteJugador extends Visitante {
	@SuppressWarnings("unused")
	private Jugador j;

	public VisitanteJugador(Jugador j) {
		this.j = j;
	}

}

