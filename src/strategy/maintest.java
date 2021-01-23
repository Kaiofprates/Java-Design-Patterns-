package strategy;

import java.util.Scanner;

public class maintest {
    /*
    
     */
    public static void  main ( String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" You need to pay $25 for mobile phone");
        System.out.println(" Please select paymente method 1:MasterCard 2:VisaCard 3:Paypal");

        int code = in.nextInt();
        PayManager payManager = null;
        if(code == 1){
            payManager = new PayManager(new MasterCard());
        }else if(code == 2){
            payManager = new PayManager(new Visa());
        }else if(code == 3){
            payManager = new PayManager(new PayPal());
        }
        payManager.doPay(25.0);
    }
}
