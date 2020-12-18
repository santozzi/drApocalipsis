package visitor;

import entidades.CuadroDeDialogo;
import entidades.explosiones.Explosion;
import entidades.explosiones.ExplosionNuclear;
import entidades.personajes.Humano;
import entidades.personajes.infectados.InfectadoAlpha;
import entidades.personajes.infectados.InfectadoBeta;
import entidades.personajes.infectados.InfectadoBossAlpha;
import entidades.personajes.infectados.InfectadoBossBeta;
import entidades.personajes.jugador.Jugador;
import entidades.premios.no_temporales.BombaAtomica;
import entidades.premios.no_temporales.Diamante;
import entidades.premios.no_temporales.Moneda;
import entidades.premios.no_temporales.Pocion;
import entidades.premios.temporales.Cuarentena;
import entidades.premios.temporales.SuperArma;
import entidades.proyectiles.particulas.ParticulaAlpha;
import entidades.proyectiles.particulas.ParticulaBeta;
import entidades.proyectiles.particulas.ParticulaBossAlpha;
import entidades.proyectiles.proyectil_jugador.ProyectilSanitario;
import entidades.proyectiles.proyectil_jugador.SuperProyectilSanitario;


/**
 * Clase visitante general. Los nombres de lo m�todos son diferentes para poder evitar posibles complicaciones al extender alguna clase concreta. Le pasamos como
 * par�metro tambi�n los tipos espec�ficos para poder aprovechar los m�todos propios de cada clase diferente.
 */
public abstract class Visitor
{

	abstract public void visitarMoneda(Moneda mon);
	abstract public void visitarDiamante(Diamante dia);

	abstract public void visitarInfectadoAlpha(InfectadoAlpha ea);

	abstract public void visitarInfectadoBeta(InfectadoBeta eb);

	abstract public void visitarJugador(Jugador J);

	abstract public void visitarProyectilSanitario(ProyectilSanitario p);

	abstract public void visitarParticulaAlpha(ParticulaAlpha par);
	abstract public void visitarParticulaBossAlpha(ParticulaBossAlpha par);
	abstract public void visitarParticulaBeta(ParticulaBeta par);
	abstract public void visitarHumano(Humano hum);

	abstract public void visitarPocion(Pocion pos);	

	abstract public void visitarCuarentena(Cuarentena cuarentena);
	abstract public void visitarSuperProyectilSanitario(SuperProyectilSanitario sps);
	abstract public void visitarSuperArma(SuperArma sarm);
	abstract public void visitarInfectadoBossAlpha(InfectadoBossAlpha ifboss);	
	abstract public void visitarInfectadoBossBeta(InfectadoBossBeta ifboss);
	abstract public void visitarCuadroDeDialogo(CuadroDeDialogo cd);
	abstract public void visitarBombaAtomica(BombaAtomica ba);
	abstract public void visitarExplosion(Explosion exp);
	abstract public void visitarExplosionNuclear(ExplosionNuclear en);
}
