package visitor;

import entidades.explosiones.Explosion;
import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;

public class VisitanteExplosion extends Visitante {
	
	@SuppressWarnings("unused")
	private Explosion explosion;

	public VisitanteExplosion(Explosion explosion) {
		this.explosion = explosion;
	}
	
	@Override
	public void visitarInfectadoAlpha(InfectadoAlpha ea) {
		ea.impacto(explosion.getLetalidad());
	}

	@Override
	public void visitarInfectadoBeta(InfectadoBeta eb) {
		eb.impacto(explosion.getLetalidad());
	}
	
	@Override
	public void visitarInfectadoBossAlpha(InfectadoBossAlpha ifboss) {
		ifboss.impacto(explosion.getLetalidad());
	}

	@Override
	public void visitarInfectadoBossBeta(InfectadoBossBeta ifboss) {
		ifboss.impacto(explosion.getLetalidad());
	}

}
