package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.proyectiles.particulas.ParticulaBeta;

public class VisitanteParticulaBeta extends Visitante {
	
	private ParticulaBeta particulaBeta;
	
	public VisitanteParticulaBeta(ParticulaBeta particulaBeta2) {
		this.particulaBeta = particulaBeta2;
	}
	
	@Override
	public void visitarJugador(Jugador j) {
		j.impacto(particulaBeta.getLetalidad());
		particulaBeta.detenerse();
		particulaBeta.desaparecer();
		
	}

}
