package entidades.explosiones;

import entidades.Entidad;
import logica.Juego;
import reproductor_de_audio.SonidoFX;
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
				SonidoFX sonido = juego.getReproductorDeEfectosDeSonido();
				juego.actualizarEntidad(this);
				accionar();
				sonido.parar();
				sonido.reproducir(this.claveImagen);
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

		int posEntidadActualX = this.vector.getPosicion().x + (this.getImagen().getIconWidth()/2);
		int posEntidadActualY = this.vector.getPosicion().y + (this.getImagen().getIconHeight()/2);

		int posEntidadParamX = entidad.getVector().getPosicion().x + (entidad.getImagen().getIconWidth()/2);
		int posEntidadParamY = entidad.getVector().getPosicion().y + (entidad.getImagen().getIconHeight()/2);

		int posActualInicioX = posEntidadActualX - this.radio;
		int posActualInicioY = posEntidadActualY - this.radio;

		int posActualFinX = posEntidadActualX + this.radio;
		int posActualFinY = posEntidadActualY + this.radio;

		boolean colisionEnX = (posEntidadParamX >= posActualInicioX) && (posEntidadParamX <= posActualFinX);
		boolean colisionEnY = (posEntidadParamY >= posActualInicioY) && (posEntidadParamY <= posActualFinY);

		return colisionEnX && colisionEnY;
	}

}
