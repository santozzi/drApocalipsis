package armas;

import entidades.proyectiles.proyectil_jugador.Misil;
import entidades.proyectiles.proyectil_jugador.SuperProyectilSanitario;
import logica.Juego;

/**
 * Los proyectiles de esta arma causan mas daño
 * Crea un SuperProyectilSanitario por disparo
 */
public class LanzaMisilesSanitario extends Arma {
    /**
     * SuperArmaSanitaria
     * @param juego
     */
	public LanzaMisilesSanitario(Juego juego) {
		super(juego);
	}
	
	@Override
	public void disparar() {
		super.disparar();
        new Misil(juego);
	}
	
}