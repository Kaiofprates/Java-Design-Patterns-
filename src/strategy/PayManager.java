package strategy;

public class PayManager {
    private Pay pay;

    public PayManager(Pay pay){
        this.pay = pay;
    }

    public void doPay(Double price){
        pay.pay(price);
    }

}
