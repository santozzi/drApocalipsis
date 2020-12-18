package reproductor_de_audio;

public class SonidoFX implements Reproductor{

	private boolean mute;
	private Audio audio;

	public SonidoFX() {
		mute = false;
		audio = null;

	}

	@Override
	public void reproducir(String nombre) {
		if(!mute && !estaReproduciendo()) {
			audio = new Audio(nombre);
			audio.iniciar();
		}
	}

	@Override
	public void parar() {
		if(estaReproduciendo()) {
			audio.detener();
			audio = null;
		}
	}
	
	@Override
	public boolean estaReproduciendo() {
		return audio!=null && audio.estaVivo();
	}

	@Override
	public void suspender() {
		parar();
		mute = true;
	}

	@Override
	public void reanudar() {
		mute = false;
	}

}
