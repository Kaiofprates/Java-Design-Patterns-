package facade;

public class LightImpl implements  Light{
    @Override
    public void flash() {
        System.out.println("Flashing color light");
    }
}
