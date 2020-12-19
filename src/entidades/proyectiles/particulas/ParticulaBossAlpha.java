package entidades.proyectiles.particulas;

import java.util.Random;

import entidades.personajes.infectados.Infectado;
import logica.Juego;
import visitor.VisitanteParticulaBossAlpha;
import visitor.Visitor;
/**
 * ParticulaAlpha
 * Especialización de Particula
 *
 */
public class ParticulaBossAlpha extends Particula{
    protected Random ran;
	public ParticulaBossAlpha(Juego juego,Infectado infectado) {
	    super(juego,infectado);
        this.letalidad = 5;
        int direccionX =0;
        int direccionY= 1;
        ran = new Random();
    	
        direccionX = ran.nextInt(3)-1;
    
    	vector.getDireccion().setLocation(direccionX, direccionY);
    	
    	
		v = new VisitanteParticulaBossAlpha(this);	
	}

	@Override
	public void accept(Visitor v) {
		v.visitarParticulaBossAlpha(this);
	}

	@Override
	public void impacto(int letalidad) {
		
	}



	
}
