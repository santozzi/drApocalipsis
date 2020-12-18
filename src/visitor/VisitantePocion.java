package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.premios.no_temporales.Pocion;

public class VisitantePocion extends Visitante {
	
	private Pocion pocion;
	
	public VisitantePocion(Pocion pos) {
		this.pocion = pos;
	}

	@Override
	public void visitarJugador(Jugador j) {
		pocion.ejecutar();
		pocion.detenerse();
        pocion.desaparecer();
		//infectadoAlpha.detenerse();
		
	}

}
