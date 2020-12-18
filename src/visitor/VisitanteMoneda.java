package visitor;

import entidades.personajes.jugador.Jugador;
import entidades.premios.no_temporales.Moneda;

public class VisitanteMoneda extends Visitante{

	protected Moneda moneda;
	
	public VisitanteMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	@Override
	public void visitarJugador(Jugador J) {
		moneda.ejecutar();
		//moneda.detenerse();
	}

}
