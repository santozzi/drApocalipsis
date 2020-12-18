package reproductor_de_audio;

public class Ambiente implements Reproductor {

	private boolean mute;
	private Audio audio;

	public Ambiente() {
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
	public void suspender() {
		if(!mute && estaReproduciendo()) {
			audio.suspender();
		}
		mute = true;
	}

	@Override
	public void reanudar() {
		if(mute && estaReproduciendo()) {
			audio.reanudar();
		}
		mute = false;
	}

	@Override
	public boolean estaReproduciendo() {
		return audio!=null && audio.estaVivo();
	}

}
