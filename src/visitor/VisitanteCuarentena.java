package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.premios.temporales.Cuarentena;

public class VisitanteCuarentena extends Visitante {
	
	private Cuarentena cuarentena;
	
	public VisitanteCuarentena(Cuarentena c) {
		this.cuarentena = c;
	}
	
	@Override
	public void visitarJugador(Jugador j) {
		cuarentena.ejecutar();
		cuarentena.detenerse();
        cuarentena.desaparecer();
	}

}
