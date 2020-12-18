package entidades.explosiones;

import entidades.Entidad;
import logica.Juego;
import visitor.VisitanteExplosion;
import visitor.Visitor;

public class Explosion extends Entidad {
	
	public Explosion(Juego j) {
		super(j);
		v = new VisitanteExplosion(this);
		juego.agregarAEntidadesParaAgregar(this);
	}

	@Override
	public void accept(Visitor v) {
		v.visitarExplosion(this);
	}

	@Override
	public void impacto(int letalidad) {}

	@Override
	public void actuar() {
		juego.actualizarEntidad(this);
		accionar();
	}
	
}
