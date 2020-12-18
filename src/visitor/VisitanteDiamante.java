package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.premios.no_temporales.Diamante;

public class VisitanteDiamante extends Visitante{

	protected Diamante diamante;
	
	public VisitanteDiamante(Diamante diamante) {
		this.diamante = diamante;
	}

	@Override
	public void visitarJugador(Jugador J) {
		diamante.ejecutar();

		
	}

}
