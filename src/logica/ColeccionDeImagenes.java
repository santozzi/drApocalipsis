package logica;

import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
/**
 * ColeccionDeImagenes
 * Colecci�n donde se encuentran todas las rutas de las im�genes del juego.
 */
public class ColeccionDeImagenes extends Imagenes{

	private Map<Integer, ImageIcon> ruta;
	private static ColeccionDeImagenes colDeImg;
	
	public static ColeccionDeImagenes getColeccionDeImagenes() {
		if(colDeImg == null)
			colDeImg = new ColeccionDeImagenes();
		return colDeImg;
	}

	private ColeccionDeImagenes() {

		this.ruta = new HashMap<Integer, ImageIcon>();
		
		// Nivel 1
		agregarRuta("Nivel1_Fondo", "/img/calle_desierto_reDimensionada.png", Juego.ANCHO_DE_COMBATE+10, Juego.ALTO_DE_COMBATE);
		agregarRuta("Nivel1_Izquierda", "/img/fondoIzquierdo_desierto_reDimensionado.png", Juego.DECORADO_IZQUIERDO, Juego.ALTO_DE_COMBATE);
		agregarRuta("Nivel1_Derecha", "/img/fondoDerecho_desierto_reDimensionado.png", Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);

		// Nivel 2
		agregarRuta("Nivel2_Fondo", "/img/calle_nivel2.jpg", Juego.ANCHO_DE_COMBATE+10, Juego.ALTO_DE_COMBATE);
		agregarRuta("Nivel2_Izquierda", "/img/ladoIzquirdo_nivel2.jpg", Juego.DECORADO_IZQUIERDO, Juego.ALTO_DE_COMBATE);
		agregarRuta("Nivel2_Derecha", "/img/ladoDerecho_nivel2.jpg", Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);
		
        // Nivel 3
		agregarRuta("Nivel3_Fondo", "/img/calle_nivel3.jpg", Juego.ANCHO_DE_COMBATE+10, Juego.ALTO_DE_COMBATE);
		agregarRuta("Nivel3_Izquierda", "/img/ladoIzquirdo_nivel3.jpg", Juego.DECORADO_IZQUIERDO, Juego.ALTO_DE_COMBATE);
		agregarRuta("Nivel3_Derecha", "/img/ladoDerecho_nivel3.jpg", Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);
		
		// Infectados
		agregarRuta("InfectadoAlpha", "/img/z_ataque_abajo.gif", 40, 60);
		agregarRuta("InfectadoBeta","/img/infectadoBeta_caminar.gif", 50, 70);
		
		// Jefes
		agregarRuta("InfectadoBossAlpha", "/img/z_ataque_abajo.gif", 140, 160);
		agregarRuta("InfectadoBossBeta","/img/infectadoBeta_caminar.gif", 140, 160);

		// Jugador
		agregarRuta("ArmaSanitaria", "/img/pistola_idle.png", 70, 50);
		agregarRuta("SuperArmaSanitaria", "/img/superArma.png", 70, 50);
		agregarRuta("LanzaMisilesSanitario", "/img/LanzaMisiles1.png", 70, 50);
		agregarRuta("Jugador_CaminarDerecha", "/img/Jugador_caminarDerecha.gif", 70, 60);
		agregarRuta("Jugador_CaminarIzquierda", "/img/Jugador_caminarIzquierda.gif", 70, 60);
		agregarRuta("ArmaSanitaria_Disparar", "/img/recargar.gif", 70, 50);
		agregarRuta("Jugador_Noqueado", "/img/personaje_noqueado.png", 70, 80);
		agregarRuta("Jugador_Muerto", "/img/personaje_muerto.png", 80, 80);
		agregarRuta("SuperArmaSanitaria_Disparar", "/img/recargar_sa.gif", 70, 50);
		agregarRuta("LanzaMisilesSanitario_Disparar", "/img/LanzaMisiles.gif", 70, 50);
		//----------
		
        // Proyectiles
	    agregarRuta("ProyectilSanitario", "/img/Jeringa2.png", 20, 50);
		agregarRuta("SuperProyectilSanitario", "/img/Super_jeringa.png", 20, 50);
		agregarRuta("Misil", "/img/misil2.png", 30, 50);
		
        // Particulas
		agregarRuta("ParticulaAlpha", "/img/particula.png", 20, 20);
		agregarRuta("ParticulaBeta", "/img/particulaBeta.png", 20, 20);
		agregarRuta("ParticulaBossAlpha", "/img/particulaBeta.png", 20, 20);
        
		// Premios
		agregarRuta("Pocion","/img/pocion.png", 50, 50);
		agregarRuta("SuperArma","/img/ak47.png", 50, 20);
		agregarRuta("Cuarentena","/img/cuarentena.png", 40, 40);
		agregarRuta("Moneda","/img/Moneda.png", 40, 40);
		agregarRuta("Diamante","/img/Diamante.png", 40, 40);
		agregarRuta("BombaAtomica","/img/BombaAtomica.png", 40, 40);
		agregarRuta("LanzaMisiles","/img/LanzaMisiles.png", 40, 30);
		
		// Humano
		agregarRuta("Humano_Cuarentena","/img/Humano_cuarentena.png", 40, 60);
		agregarRuta("Humano_SuperArma","/img/Humano_superArma.png", 40, 60);
		agregarRuta("Humano_Pocion","/img/Humano_pocion.png", 40, 60);
		agregarRuta("Humano_Correr","/img/Humano_correr.png", 40, 60);
		agregarRuta("Humano_Moneda","/img/Humano_moneda.png", 40, 60);
		agregarRuta("Humano_Diamante","/img/Humano_diamante.png", 40, 60);
		agregarRuta("Humano_BombaAtomica","/img/Humano_BombaAtomica.png", 40, 60);
		agregarRuta("Humano_LanzaMisiles","/img/Humano_LanzaMisiles.png", 40, 60);
		agregarRuta("Humano", "/img/Humano.png", 40, 60);
		
		
        // Presentacion
		agregarRuta("FrmScore_FondoPresentacion", "/img/drApocalipsis.png", 245, 390);
		agregarRuta("InicioGUI_Ruinas", "/img/ruinas.gif", 785, 700);
		agregarRuta("InicioGUI_PlagueInc", "/img/plagueInc.PNG", 80, 130);
		
        // Bara de score y Energia
		agregarRuta("Mapa_PanelDeScore","/img/panelScore.jpg", 619, 40);
		
		// Boton de pausa
		agregarRuta("Reanudar","/img/go.png", 50, 50);
		agregarRuta("Pausa","/img/pause.png", 50, 50);
		
		// Boton de sonido
		agregarRuta("Sonido","/img/sonido_on.png", 50, 50);
		agregarRuta("Silencio","/img/sonido_off.png", 50, 50);
		
		// Explosiones
		agregarRuta("Explosion","/img/explosion8.gif", 100, 150);
		agregarRuta("ExplosionNuclear","/img/ExplosionNuclear.gif", Juego.DECORADO_IZQUIERDO+Juego.ANCHO_DE_COMBATE+Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);
		
		// Otros
		//agregarRuta("Nivel_AutoEnLlamas","/img/autoEnLlamas.gif", 75, 120);
		agregarRuta("CuadroDeDialogo","/img/dialogo.png", 80, 40);
		agregarRuta("Pausado", "/img/pausa.gif", Juego.ANCHO_DE_COMBATE, 200);
     
	}
    /**
     * agregarRuta
     * Agrega la nueva ruta al mapeo
     * @param clave
     * @param ruta
     * @param ancho
     * @param alto
     */
	private void agregarRuta(String clave, String ruta, int ancho, int alto) {
		ImageIcon icono = new ImageIcon(this.getClass().getResource(ruta));
		icono.setImage(icono.getImage().getScaledInstance(ancho, alto, 0));
		this.ruta.put(clave.hashCode(), icono);

	}

	public ImageIcon getImagen(String clave) {
		return this.ruta.get(clave.hashCode());
	}
    
	/**
	 * Devuelve la tematica de la colecci�n
	 */
	@Override
	public String toString() {
		return "infectados";
	}

}
