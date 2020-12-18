

package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import entidades.Entidad;
import entidades.personajes.jugador.Jugador;
import entidades.personajes.jugador.comandos.CaminarDerecha;
import entidades.personajes.jugador.comandos.CaminarIzquierda;
import entidades.personajes.jugador.comandos.Detenerse;
import entidades.personajes.jugador.comandos.Disparar;
import entidades.personajes.jugador.comandos.IComando;
import entidades.personajes.jugador.controles.InterfazDeControl;
import entidades.personajes.jugador.controles.Mouse;
import entidades.personajes.jugador.controles.Teclado;
import logica.ColeccionDeImagenes;
import logica.Juego;
import logica.contabilidad.Item;
import observador.IObservador;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class Mapa  extends JFrame implements IObservador{

	protected Juego juego;
	protected JLabel jugador;
	protected JLabel lblFondo;
	protected Panel panelFondo;

	protected JPanel panelDeEntidades;
	protected InterfazDeControl teclado;
	protected InterfazDeControl mouse;
	protected JProgressBar progressBar;
	private Map<Entidad,JLabel> mapeoEntidades;
	protected JLabel lblMapaDerecha;
	protected JLabel lblMapaIzquierda;
	private JLabel lblSalud;
	private JLabel lblScore;
	protected IObservador estadistica;
	protected JToggleButton tglbtnMute;
	protected JToggleButton tglbtnPausa;
	protected JLabel lblPausa;
	protected JLabel lblApocalipsis;

	public Mapa() {
		iniciar();

	}

	public void  iniciar() {
		setVisible(true);
		getContentPane().update(getGraphics());
		estadistica = new FrmScore(this,juego);

		juego = new Juego();
		mouse= new Mouse();
		teclado = new Teclado();
		addKeyListener(teclado);
		addMouseListener(mouse);

		getContentPane().setLayout(null);
		setResizable(false);

		//panelDeEntidades = new JPanel();

		mapeoEntidades = new HashMap<Entidad, JLabel>();

		setTitle("Dr. Apocalipsis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int anchoDelFrame = Juego.DECORADO_IZQUIERDO + Juego.ANCHO_DE_COMBATE + Juego.DECORADO_DERECHO + 16;
		int altoDelframe = Juego.ALTO_DE_COMBATE + 90;

		setBounds(0, 0, anchoDelFrame, altoDelframe);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

		//ImageIcon imagendDeFondo = ColeccionDeImagenes.getColeccionDeImagenes().getImagen("nivel1");

		progressBar = new JProgressBar();
		progressBar.setValue(100);
		progressBar.setForeground(new Color(124, 252, 0));
		progressBar.setBackground(Color.RED);
		progressBar.setBounds(631, 11, 110, 22);
		//getContentPane().add(progressBar);

		lblApocalipsis = new JLabel();
		lblApocalipsis.setBounds(0, 0, Juego.DECORADO_IZQUIERDO+Juego.ANCHO_DE_COMBATE+Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);
		getContentPane().add(lblApocalipsis);

		//lblFondo = new JLabel(imagendDeFondo);
		panelFondo = new FondoPanel();
		panelFondo.setLayout(null);
		//lblFondo.setBounds(Juego.DECORADO_IZQUIERDO, 0, Juego.ANCHO_DE_COMBATE, Juego.ALTO_DE_COMBATE);
		panelFondo.setBounds(Juego.DECORADO_IZQUIERDO, 0, Juego.ANCHO_DE_COMBATE, Juego.ALTO_DE_COMBATE);

		//ImageIcon barandaDerecha = ColeccionDeImagenes.getColeccionDeImagenes().getImagen("fondoDerecha");

		lblMapaDerecha = new JLabel("");
		lblMapaDerecha.setBounds(Juego.ANCHO_DE_COMBATE+Juego.DECORADO_IZQUIERDO, 0, Juego.DECORADO_DERECHO, Juego.ALTO_DE_COMBATE);


		getContentPane().add(lblMapaDerecha);

		lblMapaIzquierda = new JLabel("");
		lblMapaIzquierda.setBounds(0, 0, Juego.DECORADO_IZQUIERDO, Juego.ALTO_DE_COMBATE);
		//ImageIcon barandaIzquierda = ColeccionDeImagenes.getColeccionDeImagenes().getImagen("fondoIzquierda");

		//barandaIzquierda.setImagen("mapaIzquierda");


		getContentPane().add(lblMapaIzquierda);

		getContentPane().add(panelFondo);

		JPanel panelAbajo = new JPanel();
		panelAbajo.setBackground(Color.BLACK);

		panelAbajo.setBounds(0, 620, 826, 50);
		panelAbajo.setLayout(null);
		JLabel lblPanelScore = new JLabel();
		ImageIcon panelDeAbajoIcon = ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Mapa_PanelDeScore");
		lblPanelScore.setBounds(158, 0, 619, 39);
		lblPanelScore.setIcon(panelDeAbajoIcon);




		panelAbajo.add(progressBar);



		getContentPane().add(panelAbajo);

		lblSalud = new JLabel("Salud");
		lblSalud.setBackground(Color.WHITE);
		lblSalud.setForeground(Color.GREEN);
		lblSalud.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalud.setBounds(520, 11, 110, 22);
		panelAbajo.add(lblSalud);


		lblScore = new JLabel();
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setText("0");
		lblScore.setForeground(Color.GREEN);
		lblScore.setBounds(342, 11, 133, 21);
		panelAbajo.add(lblScore);

		//JButton btnPausa = new JButton();


		JLabel lblPts = new JLabel();
		lblPts.setText("PTS.");
		lblPts.setHorizontalAlignment(SwingConstants.CENTER);
		lblPts.setForeground(Color.GREEN);
		lblPts.setBounds(299, 11, 33, 21);
		panelAbajo.add(lblPts);
		panelAbajo.add(lblPanelScore);

		lblPausa = new JLabel();
		lblPausa.setBounds(0, Juego.ALTO_DE_COMBATE/4, Juego.ANCHO_DE_COMBATE, 200);
		panelFondo.add(lblPausa);

		tglbtnPausa = new JToggleButton();
		tglbtnPausa.setBounds(24, 0, 50, 50);
		panelAbajo.add(tglbtnPausa);
		tglbtnPausa.setFocusable(false);
		tglbtnPausa.setFocusTraversalKeysEnabled(false);
		tglbtnPausa.setFocusPainted(false);
		tglbtnPausa.setRequestFocusEnabled(false);
		tglbtnPausa.setRolloverEnabled(false);
		tglbtnPausa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnPausa.isSelected()) {
					juego.suspenderHiloSecundario();
					tglbtnPausa.setIcon(ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Pausa"));
					lblPausa.setIcon(ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Pausado"));
					panelFondo.repaint();
				} else {
					juego.reanudarHiloSecundario();
					tglbtnPausa.setIcon(ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Reanudar"));
					lblPausa.setIcon(null);
				}
			}

		});
		tglbtnPausa.setIcon(ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Reanudar"));

		tglbtnMute = new JToggleButton();
		tglbtnMute.setBounds(97, 0, 50, 50);
		panelAbajo.add(tglbtnMute);
		tglbtnMute.setFocusable(false);
		tglbtnMute.setFocusTraversalKeysEnabled(false);
		tglbtnMute.setFocusPainted(false);
		tglbtnMute.setRequestFocusEnabled(false);
		tglbtnMute.setRolloverEnabled(false);
		tglbtnMute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnMute.isSelected()) {
					juego.silenciarAudio();
					tglbtnMute.setIcon(ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Silencio"));
				} else {
					juego.reanudarAudio();
					tglbtnMute.setIcon(ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Sonido"));
				}
			}
		});
		tglbtnMute.setIcon(ColeccionDeImagenes.getColeccionDeImagenes().getImagen("Sonido"));

		juego.agregarObservador(this);
		juego.agregarObservador(estadistica);
		juego.cargarJugador();
		juego.cargarNivel();

	}

	public void cargarEntidades() {
		// pintarEntidades();
		jugador = mapeoEntidades.get(juego.getJugador());

		if(jugador!=null) {


			jugador.setIcon(juego.getJugador().getImagen());

			jugador.setBounds(
					juego.getJugador().getVector().getPosicion().x,
					juego.getJugador().getVector().getPosicion().y,
					juego.getJugador().getImagen().getIconWidth(),
					juego.getJugador().getImagen().getIconHeight());

			jugador.updateUI();
		}

		//pnlAreaDeJuego.updateUI();
	}


	public void update() {

		IComando comando;
		Jugador gamer = juego.getJugador();
		if(!gamer.estaInfectado()) {
			if(teclado.isDerecha()) {
				comando = new CaminarDerecha(gamer);
			}else if(teclado.isIzquierda()) {

				comando = new CaminarIzquierda(gamer);

			}else if((teclado.isDisparar()&&teclado.isLlave())||(mouse.isDisparar()&&mouse.isLlave())) {
				comando = new Disparar(gamer);
				teclado.setLlave(false);
				mouse.setLlave(false);


			}else {
				comando = new Detenerse(gamer);

			}
			comando.ejecutar();
		}

		cargarEntidades();
	}


	public void updateEntidades(Entidad entidad)  {
		// System.out.println(entidad.getImagen());

		if(entidad.getImagen().getIconWidth()>Juego.ANCHO_DE_COMBATE) {
			lblApocalipsis.setIcon(entidad.getImagen());
			lblMapaIzquierda.repaint();
			lblMapaDerecha.repaint();
		}
		else {
			JLabel etiquetaDeEntidad;

			//System.out.println("posicion en entidad: ("+entidad.getPosicion().x+";"+entidad.getPosicion().y+")");
			etiquetaDeEntidad = new JLabel();

			//	System.out.println(entidad.toString());
			etiquetaDeEntidad.setBounds(
					entidad.getVector().getPosicion().x,
					entidad.getVector().getPosicion().y,
					entidad.getImagen().getIconWidth(),
					entidad.getImagen().getIconHeight());
			etiquetaDeEntidad.setIcon(entidad.getImagen());

			mapeoEntidades.put(entidad,etiquetaDeEntidad);

			panelFondo.add(etiquetaDeEntidad);

			//getContentPane().add(lblFondo);
			//getContentPane().add(panelFondo);
		}
		panelFondo.repaint();

	}
	public void updateEntidad(Entidad entidad) {



		JLabel lblEntidad = mapeoEntidades.get(entidad);

		if(lblEntidad!=null) {
			// esto es para que el infectado re aparezca por arriba una vez que salio del mapa
			// hay que tener en cuenta que hacer con los premios
			actualizarLimiteVirtual(entidad);
			lblEntidad.setIcon(entidad.getImagen());

			lblEntidad.setBounds(
					entidad.getVector().getPosicion().x,
					entidad.getVector().getPosicion().y,
					entidad.getImagen().getIconWidth(),
					entidad.getImagen().getIconHeight());

			lblEntidad.updateUI();
		}

	}
	private void actualizarLimiteVirtual(Entidad entidad) {
		if(entidad.getVector().getPosicion().y>Juego.ALTO_DE_COMBATE) {

			if(juego.getLimite().x >= Juego.ANCHO_DE_COMBATE-entidad.getImagen().getIconWidth()) {
				entidad.getVector().getPosicion().y =  juego.getLimite().y-entidad.getImagen().getIconHeight();
				juego.getLimite().x = 0;
			}
			else {
				entidad.getVector().getPosicion().x = juego.getLimite().x;
				entidad.getVector().getPosicion().y = juego.getLimite().y;
				juego.getLimite().x += entidad.getImagen().getIconWidth();
			}
		}
		//entidad.getVector().getPosicion().x = juego.getLimite().x;
		//entidad.getVector().getPosicion().y = juego.getLimite().y;
		//System.out.println("Limite: X=" + juego.getLimite().x + " ; Y=" + juego.getLimite().y + " (Mapa)");


	}

	private class FondoPanel extends Panel{

		private Image imagen;

		@Override
		public void paint(Graphics grafico) {

			//imagen = ColeccionDeImagenes.getColeccionDeImagenes().getImagen("nivel1").getImage();
			grafico.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			setOpaque(false);
			super.paint(grafico);
			setVisible(true);

		}
		public void setImagenDeFondo(ImageIcon imagen) {
			this.imagen = imagen.getImage();

		}

	}


	public void quitarEntidad(Entidad entidad) {
		if(entidad.getImagen().getIconWidth()>Juego.ANCHO_DE_COMBATE) {
			lblApocalipsis.setIcon(null);
		}
		else {
			JLabel etiquetaEliminada = mapeoEntidades.remove(entidad);

			if(etiquetaEliminada!=null) {
				panelFondo.remove(etiquetaEliminada);
				panelFondo.repaint();
			}
		}
	} 


	//cambia la barra de energia
	@Override
	public void updateEnergiaJugador() {
		Jugador jugador = juego.getJugador();
		progressBar.setValue(jugador.getCargaViral());

		if(jugador.estaInfectado()) {
			JLabel lblJugador = new JLabel("");
			ImageIcon jugadorMuerto = ColeccionDeImagenes.getColeccionDeImagenes().getImagen(jugador.getClass().getSimpleName()+"_Muerto");
			lblJugador.setBounds(jugador.getPosicion().x, jugador.getPosicion().y, jugadorMuerto.getIconWidth(), jugadorMuerto.getIconHeight());
			lblJugador.setIcon(jugadorMuerto);
			panelFondo.add(lblJugador);
			panelFondo.repaint();
		}
	}



	@Override
	public void updateNivel(ImageIcon izq, ImageIcon fondo, ImageIcon der) {
		panelFondo.setImagenDeFondo(fondo);
		panelFondo.repaint();
		lblMapaDerecha.setIcon(der);
		lblMapaIzquierda.setIcon(izq);

	}



	@Override
	public void updateScore(int score) {
		lblScore.setText(score+"");

	}



	@Override
	public void updateEstedistica(Collection<Item> datos) {

		juego.interrumpirAudio();

		if(juego.getJugador().estaInfectado())
			juego.getReproductorDeMusica().reproducir("game-over");
		else
			juego.getReproductorDeMusica().reproducir("creditos");

		estadistica.iniciar();

	}

	@Override
	public void cerrar() {
		juego.interrumpirAudio();
		dispose();

	}
}