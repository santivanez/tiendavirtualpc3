import pattern.IObserver;

public class Admi implements IObserver {

	public void notificacion(String mensaje){
		System.out.println(mensaje);
	}
	
}