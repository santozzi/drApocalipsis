package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.premios.no_temporales.BombaAtomica;

public class VisitanteBombaAtomica extends Visitante {
	
	private BombaAtomica bombaAtomica;
	
	public VisitanteBombaAtomica(BombaAtomica ba) {
		this.bombaAtomica = ba;
	}
	
	@Override
	public void visitarJugador(Jugador J) {
		bombaAtomica.ejecutar();
		bombaAtomica.detenerse();
		bombaAtomica.desaparecer();
	}

}
