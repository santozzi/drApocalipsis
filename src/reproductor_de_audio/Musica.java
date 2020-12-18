package reproductor_de_audio;


public class Musica implements Reproductor {

	private boolean mute;
	private boolean enEspera;
	private Audio audio;

	public Musica() {
		mute = false;
		enEspera = false;
		audio = null;
	}

	@Override
	public void reproducir(String nombre) {
		if(!estaReproduciendo()) {
			audio = new Audio(nombre);
			if(!mute)
				audio.iniciar();
			else
				enEspera = true;
		}
	}

	@Override
	public void parar() {
		if(estaReproduciendo()) {
			audio.detener();
			audio = null;
			enEspera = false;
		}
	}

	@Override
	public void suspender() {
		if(!mute && estaReproduciendo()) {
			audio.suspender();
		}
		mute = true;
	}

	@Override
	public void reanudar() {
		if(mute) {
			if(enEspera)
				audio.iniciar();
			else if(estaReproduciendo())
				audio.reanudar();

			enEspera = false;
			mute = false;
		}
	}

	@Override
	public boolean estaReproduciendo() {
		return audio!=null && audio.estaVivo();
	}

}
