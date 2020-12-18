package visitor;

import entidades.personajes.infectados.InfectadoBossBeta;
import entidades.personajes.jugador.Jugador;

public class VisitanteInfectadoBossBeta extends Visitante {
	
	private InfectadoBossBeta infectadoBossBeta;

	public VisitanteInfectadoBossBeta(InfectadoBossBeta infectadoBossBeta) {
		this.infectadoBossBeta = infectadoBossBeta;
	}

	@Override
	public void visitarJugador(Jugador j) {
		infectadoBossBeta.getVector().getPosicion().y --;
		infectadoBossBeta.atacar(j);
		
	}

}
