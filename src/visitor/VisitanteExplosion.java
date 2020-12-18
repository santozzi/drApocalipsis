package visitor;

import entidades.explosiones.Explosion;

public class VisitanteExplosion extends Visitante {
	
	@SuppressWarnings("unused")
	private Explosion explosion;

	public VisitanteExplosion(Explosion explosion) {
		this.explosion = explosion;
	}

}
