
public class App {

	public static void main(String[] args) {
		
		Producto palta = new Producto(10);
		
		Admi admi1 = new Admi();
		Admi admi2 = new Admi();
			
		palta.addObserver(admi1);
		palta.addObserver(admi2);
		
		palta.venta();
	}
}
