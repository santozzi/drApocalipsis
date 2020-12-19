package visitor;

import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;
import entidades.proyectiles.proyectil_jugador.Misil;

public class VisitanteMisil extends Visitante {

	private Misil misil;

	public VisitanteMisil(Misil misil) {
		this.misil = misil;
	}

	@Override
	public void visitarInfectadoAlpha(InfectadoAlpha ia) {
		misil.explotar();
		misil.detenerse();
		misil.desaparecer();

	}

	@Override
	public void visitarInfectadoBeta(InfectadoBeta ib) {
		misil.explotar();
		misil.detenerse();
		misil.desaparecer();

	}

	@Override
	public void visitarInfectadoBossAlpha(InfectadoBossAlpha ifboss) {
		misil.explotar();
		misil.detenerse();
		misil.desaparecer();

	}

	@Override
	public void visitarInfectadoBossBeta(InfectadoBossBeta ifboss) {
		misil.explotar();
		misil.detenerse();
		misil.desaparecer();

	}

}
