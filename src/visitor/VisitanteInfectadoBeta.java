package visitor;

import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.jugador.Jugador;

public class VisitanteInfectadoBeta extends Visitante {
	
	private InfectadoBeta infectadoBeta;
	
	public VisitanteInfectadoBeta(InfectadoBeta ib) {
		this.infectadoBeta = ib;
	}

	@Override
	public void visitarJugador(Jugador j) {
		infectadoBeta.getVector().getPosicion().y --;
		infectadoBeta.atacar(j);
		
	}

}
