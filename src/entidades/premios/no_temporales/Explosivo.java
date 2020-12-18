package entidades.premios.no_temporales;

import logica.Juego;

public abstract class Explosivo extends NoTemporal {

	public Explosivo(Juego juego) {
		super(juego);
	}
	
	@Override
	public void impacto(int letalidad) {}
	
}
