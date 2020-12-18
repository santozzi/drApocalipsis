package visitor;

import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.jugador.Jugador;

public class VisitanteInfectadoBossAlpha extends Visitante {
	
	private InfectadoBossAlpha infectadoBossAlpha;

	public VisitanteInfectadoBossAlpha(InfectadoBossAlpha infectadoBossAlpha) {
		this.infectadoBossAlpha = infectadoBossAlpha;
	}

	@Override
	public void visitarJugador(Jugador j) {
		infectadoBossAlpha.getVector().getPosicion().y --;
		infectadoBossAlpha.atacar(j);
		
	}

}
