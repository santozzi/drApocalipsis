package visitor;

import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.jugador.Jugador;

public class VisitanteInfectadoAlpha extends Visitante {
	
	private InfectadoAlpha infectadoAlpha;
	
	public VisitanteInfectadoAlpha(InfectadoAlpha ia) {
		this.infectadoAlpha = ia;
	}

	@Override
	public void visitarJugador(Jugador j) {
		
		infectadoAlpha.getVector().getPosicion().y --;
		infectadoAlpha.atacar(j);
		//j.impacto(infectadoAlpha.getLetalidadFisica());
		//infectadoAlpha.detenerse();
		
	}

}
