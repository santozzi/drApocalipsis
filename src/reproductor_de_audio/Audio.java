package reproductor_de_audio;

public class Audio {

	private Thread hilo;
	private AudioPlayer ap;

	public Audio(String pista) {
		ap = new AudioPlayer("/audio/" + pista + ".mp3");
		hilo = new Thread(ap);
	}

	public void iniciar() {
		hilo.start();
	}

	public void detener() {
		hilo.interrupt();
		hilo.stop();
	}

	public boolean estaVivo() {
		return hilo.isAlive();
	}

	public void suspender() {
		hilo.interrupt();
		hilo.suspend();
	}

	public void reanudar() {
		hilo.resume();
	}
	

}
