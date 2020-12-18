package reproductor_de_audio;

public interface Reproductor {
	
	public void reproducir(String nombre);

	public void parar();

	public void suspender();

	public void reanudar();
	
	public boolean estaReproduciendo();

}
