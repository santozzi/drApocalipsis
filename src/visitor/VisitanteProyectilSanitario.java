package visitor;

import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;
import entidades.proyectiles.proyectil_jugador.ProyectilSanitario;

public class VisitanteProyectilSanitario extends Visitante {
	
	private ProyectilSanitario proyectilSanitario;
	
	public VisitanteProyectilSanitario(ProyectilSanitario ps) {
		this.proyectilSanitario = ps;
	}

	@Override
	public void visitarInfectadoAlpha(InfectadoAlpha ia) {
	    ia.impacto(proyectilSanitario.getLetalidad());
		proyectilSanitario.detenerse();
		proyectilSanitario.desaparecer();
		
	}

	@Override
	public void visitarInfectadoBeta(InfectadoBeta ib) {
	    ib.impacto(proyectilSanitario.getLetalidad());
		proyectilSanitario.detenerse();
		proyectilSanitario.desaparecer();
		
	}

	@Override
	public void visitarInfectadoBossAlpha(InfectadoBossAlpha ifboss) {
		ifboss.impacto(proyectilSanitario.getLetalidad());
		proyectilSanitario.detenerse();
		proyectilSanitario.desaparecer();
		
	}

	@Override
	public void visitarInfectadoBossBeta(InfectadoBossBeta ifboss) {
		ifboss.impacto(proyectilSanitario.getLetalidad());
		proyectilSanitario.detenerse();
		proyectilSanitario.desaparecer();
		
	}

}
