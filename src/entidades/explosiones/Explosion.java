package entidades.explosiones;

import entidades.Entidad;
import logica.Juego;
import visitor.VisitanteExplosion;
import visitor.Visitor;

public class Explosion extends Entidad {
	
	protected int radio;
	protected int letalidad;
	
	public Explosion(Juego j) {
		super(j);
		this.radio = 100;
		this.letalidad = 50;
		this.latencia = 0;
		this.tiempoDeEspera = 200;
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

		if(tiempoDeEspera>0) {
			if(latencia==0) {
				juego.actualizarEntidad(this);
				accionar();
				juego.getReproductorDeEfectosDeSonido().reproducir(this.claveImagen);
			}
			latencia++;
			if(latencia>=tiempoDeEspera)
				desaparecer();
		}

	}
	
	public int getLetalidad() {
		return this.letalidad;
	}
	
	@Override
	public boolean hayColision(Entidad entidad) {
		
		int posEntidadActualX = this.vector.getPosicion().x;
		int posEntidadActualY = this.vector.getPosicion().y;
		
		int posEntidadInicioX = entidad.getVector().getPosicion().x - this.radio;
		int posEntidadInicioY = entidad.getVector().getPosicion().y - this.radio;
		
		int posEntidadFinX = entidad.getVector().getPosicion().x + this.radio;
		int posEntidadFinY = entidad.getVector().getPosicion().y + this.radio;
		
		boolean colisionEnX = (posEntidadActualX >= posEntidadInicioX) && (posEntidadActualX <= posEntidadFinX);
		boolean colisionEnY = (posEntidadActualY >= posEntidadInicioY) && (posEntidadActualY <= posEntidadFinY);
		
		return colisionEnX && colisionEnY;
	}
	
}
