package entidades.premios.temporales;

import armas.LanzaMisilesSanitario;
import entidades.personajes.jugador.Jugador;
import logica.Juego;
import visitor.VisitanteLanzaMisiles;
import visitor.Visitor;

public class LanzaMisiles extends Temporal{
	
	protected Jugador jugador;

	public LanzaMisiles(Juego juego) {
		super(juego);
		this.jugador = juego.getJugador();
		v = new VisitanteLanzaMisiles(this);
	}
	
	@Override
	public void ejecutar() {
	    jugador.cambiarEstadoTemporal();
		jugador.cambiarArma(new LanzaMisilesSanitario(juego));
	}
	@Override
	public void accept(Visitor v) {
		v.visitarLanzaMisiles(this);
	}
	@Override
	public void impacto(int letalidad) {
		
	}

}
