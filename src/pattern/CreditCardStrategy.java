package pattern;

public class CreditCardStrategy implements PaymentStrategy{

    private String cardNumber;
    private String dateExpiration;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String dateExpiration, String cvv) {
        this.cardNumber = cardNumber;
        this.dateExpiration = dateExpiration;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " pagado con tarjeta de crédito");
    }
}
