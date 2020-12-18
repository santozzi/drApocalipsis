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
		this.radio = 50;
		this.letalidad = 50;
		this.latencia = 0;
		this.tiempoDeEspera = 500;
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
		
		int posEntidadParametroX = entidad.getVector().getPosicion().x;
		int posEntidadParametroY = entidad.getVector().getPosicion().y;
		
		int posEntidadConAnchoX = posEntidadParametroX + entidad.getImagen().getIconWidth() + this.radio;
		int posEntidadConAltoY = posEntidadParametroY + entidad.getImagen().getIconHeight() + this.radio;
		
		boolean colisionEnX = (posEntidadActualX<= posEntidadConAnchoX) && (posEntidadActualX >= posEntidadParametroX-10);
		boolean colisionEnY = (posEntidadActualY+this.getImagen().getIconHeight()>=posEntidadConAltoY);
		
		return colisionEnX && colisionEnY;
	}
	
}
