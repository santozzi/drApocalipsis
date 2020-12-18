package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.proyectiles.particulas.ParticulaAlpha;

public class VisitanteParticulaAlpha extends Visitante {
	
	private ParticulaAlpha particulaAlpha;
	
	public VisitanteParticulaAlpha(ParticulaAlpha ia) {
		this.particulaAlpha = ia;
	}

	@Override
	public void visitarJugador(Jugador j) {
		j.impacto(particulaAlpha.getLetalidad());
		particulaAlpha.detenerse();
		particulaAlpha.desaparecer();
	}

}
