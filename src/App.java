import model.Fruta;
import model.Item;
import model.Lacteos;
import pattern.PayPalStrategy;
import pattern.ShoppingCart;

public class App {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item yogurt = new Lacteos("Yogurt", "Gloria", 2.4, "07/11/2020");
        Item sandía = new Fruta("Sandia", 2.5, 3.5);

        cart.addItem(yogurt);
        cart.addItem(sandía);

        cart.pay(new PayPalStrategy("correo@correo.com", "pwd"));

        Admi admi1 = new Admi();
        yogurt.addObserver(admi1);

        yogurt.venta();

    }
}
