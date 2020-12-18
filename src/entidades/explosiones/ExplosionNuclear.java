package entidades.explosiones;

import entidades.Entidad;
import logica.Juego;
import visitor.VisitanteExplosionNuclear;
import visitor.Visitor;

public class ExplosionNuclear extends Explosion {

	protected int letalidad;

	public ExplosionNuclear(Juego j) {
		super(j);
		vector.getPosicion().setLocation(0, 0);
		this.letalidad = 100;
		this.latencia = 0;
		this.tiempoDeEspera = 500;
		v = new VisitanteExplosionNuclear(this);

	}

	@Override
	public void accept(Visitor v) {
		v.visitarExplosionNuclear(this);
	}

	public int getLetalidad() {
		return this.letalidad;
	}

	@Override
	public boolean hayColision(Entidad entidad) {
		return entidad.getPosicion().y>=-100;
	}

	@Override
	public void actuar() {

		if(tiempoDeEspera>0) {
			if(latencia==0) {
				juego.actualizarEntidad(this);
				accionar();
				juego.getReproductorDeEfectosDeSonido().reproducir("ExplosionNuclear");
			}
			latencia++;
			if(latencia>=tiempoDeEspera)
				desaparecer();
		}

	}


}
