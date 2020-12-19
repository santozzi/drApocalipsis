package entidades.proyectiles.proyectil_jugador;

import entidades.explosiones.Explosion;
import logica.Juego;
import visitor.VisitanteMisil;
import visitor.Visitor;
/**
 * SuperProyectilSanitario
 * Especializacion de ProyectilJugador que tiene mas letalidad.
 */
public class Misil extends ProyectilJugador {
	
    public Misil(Juego juego) {
    	super(juego);
		vector.getPosicion().x= jugador.getVector().getPosicion().x+20;
    	v = new VisitanteMisil(this);
    }
	@Override
	public void accept(Visitor v) {
		v.visitarMisil(this);
	}
	@Override
	public void impacto(int letalidad) {
	}
	
	public void explotar() {
		Explosion exp = new Explosion(juego);
		exp.setPosicion(this.vector.getPosicion().x-this.getImagen().getIconWidth(), this.vector.getPosicion().y-this.getImagen().getIconHeight());
		exp.actuar();
	}

}
