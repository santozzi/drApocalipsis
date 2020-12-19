package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.proyectiles.particulas.ParticulaBossAlpha;

public class VisitanteParticulaBossAlpha extends Visitante {
	
	private ParticulaBossAlpha particulaAlpha;
	
	public VisitanteParticulaBossAlpha(ParticulaBossAlpha ia) {
		this.particulaAlpha = ia;
	}

	@Override
	public void visitarJugador(Jugador j) {
		j.impacto(particulaAlpha.getLetalidad());
		particulaAlpha.detenerse();
		particulaAlpha.desaparecer();
	}

}
