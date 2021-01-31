package adapter.battery;

public class TestBattery {
    public static void main(String[] args){

        Plug plug = new HighVoltagePlug();
        System.out.println(plug.recharge() + " too much voltage");

        plug = new AdapterPlug();
        System.out.println("Adapter into " + plug.recharge() + " voltage");
    }
}
