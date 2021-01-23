package strategy;

public class MasterCard implements Pay{
    @Override
    public void pay(Double price) {
        System.out.println(" Pay " + price + " Master Card");
    }
}
