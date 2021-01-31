package adapter.battery;

public class HighVoltagePlug implements Plug{

    @Override
    public int recharge() {
        return 100; // Power is 100 Voltage
    }
}
