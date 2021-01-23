package strategy;

public class Visa  implements Pay{

    @Override
    public void pay(Double price) {
        System.out.println("Pay "+ price + " Visa");
    }
}
