package visitor;

import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;
import entidades.proyectiles.proyectil_jugador.SuperProyectilSanitario;

public class VisitanteSuperProyectilSanitario extends Visitante {
	
	private SuperProyectilSanitario superProyectilSanitario;

	public VisitanteSuperProyectilSanitario(SuperProyectilSanitario superProyectilSanitario) {
		this.superProyectilSanitario = superProyectilSanitario;
	}

	@Override
	public void visitarInfectadoAlpha(InfectadoAlpha ia) {
		 ia.impacto(superProyectilSanitario.getLetalidad());
			superProyectilSanitario.detenerse();
			superProyectilSanitario.desaparecer();
		
	}

	@Override
	public void visitarInfectadoBeta(InfectadoBeta ib) {
		 ib.impacto(superProyectilSanitario.getLetalidad());
			superProyectilSanitario.detenerse();
			superProyectilSanitario.desaparecer();
		
	}

	@Override
	public void visitarInfectadoBossAlpha(InfectadoBossAlpha ifboss) {
		 ifboss.impacto(superProyectilSanitario.getLetalidad());
			superProyectilSanitario.detenerse();
			superProyectilSanitario.desaparecer();
		
	}

	@Override
	public void visitarInfectadoBossBeta(InfectadoBossBeta ifboss) {
		 ifboss.impacto(superProyectilSanitario.getLetalidad());
			superProyectilSanitario.detenerse();
			superProyectilSanitario.desaparecer();
		
	}

}
