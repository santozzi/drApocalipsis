package visitor;

import entidades.explosiones.ExplosionNuclear;
import entidades.personajes.Humano;
import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;
import entidades.proyectiles.particulas.ParticulaAlpha;
import entidades.proyectiles.particulas.ParticulaBeta;

public class VisitanteExplosionNuclear extends Visitante {
	
	@SuppressWarnings("unused")
	private ExplosionNuclear explosionNuclear;

	public VisitanteExplosionNuclear(ExplosionNuclear explosionNuclear) {
		this.explosionNuclear = explosionNuclear;
	}

	@Override
	public void visitarInfectadoAlpha(InfectadoAlpha ea) {
		ea.detenerse();
		ea.desaparecer();
	}

	@Override
	public void visitarInfectadoBeta(InfectadoBeta eb) {
		eb.detenerse();
		eb.desaparecer();
	}

	@Override
	public void visitarParticulaAlpha(ParticulaAlpha par) {
		par.detenerse();
		par.desaparecer();
	}

	@Override
	public void visitarParticulaBeta(ParticulaBeta par) {
		par.detenerse();
		par.desaparecer();
	}

	@Override
	public void visitarHumano(Humano hum) {
		hum.detenerse();
		hum.desaparecer();
	}
	
	@Override
	public void visitarInfectadoBossAlpha(InfectadoBossAlpha ifboss) {
		ifboss.impacto(explosionNuclear.getLetalidad());
	}

	@Override
	public void visitarInfectadoBossBeta(InfectadoBossBeta ifboss) {
		ifboss.impacto(explosionNuclear.getLetalidad());
	}
	
}
