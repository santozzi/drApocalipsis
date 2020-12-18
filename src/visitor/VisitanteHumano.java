package visitor;

import entidades.personajes.Humano;
import entidades.personajes.jugador.Jugador;

public class VisitanteHumano extends Visitante {

	private Humano humano;

	public VisitanteHumano(Humano ps) {
		this.humano = ps;
	}

	@Override
	public void visitarJugador(Jugador j) {
		if(!humano.soltoPremio()) {
			humano.dejarCaerPremio();
			humano.getVector().setModulo(8);
		}
	}

}
