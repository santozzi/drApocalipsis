package entidades.explosiones;

import entidades.Entidad;
import logica.Juego;
import visitor.VisitanteExplosionNuclear;
import visitor.Visitor;

public class ExplosionNuclear extends Explosion {

	public ExplosionNuclear(Juego j) {
		super(j);
		vector.getPosicion().setLocation(0, 0);
		this.letalidad = 100;
		this.tiempoDeEspera = 500;
		v = new VisitanteExplosionNuclear(this);

	}

	@Override
	public void accept(Visitor v) {
		v.visitarExplosionNuclear(this);
	}

	@Override
	public boolean hayColision(Entidad entidad) {
		return entidad.getPosicion().y>=-100;
	}

}
