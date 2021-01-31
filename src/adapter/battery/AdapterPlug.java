package adapter.battery;

public class AdapterPlug implements Plug{
    @Override
    public int recharge() {
        HighVoltagePlug bigPlug = new HighVoltagePlug();
        int v = bigPlug.recharge();
        v = v - 64;
        return v;
    }
}
