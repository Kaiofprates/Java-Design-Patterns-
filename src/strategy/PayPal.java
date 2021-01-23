package strategy;

public class PayPal implements Pay {

    @Override
    public void pay(Double price) {
        System.out.println(" Pay " + price + " PayPal");
    }
}
