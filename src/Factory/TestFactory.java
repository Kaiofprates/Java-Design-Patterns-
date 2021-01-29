package Factory;

public class TestFactory {
    public static void main(String[] args){
        Product p = Factory.create(0);
        p.print();

        p=Factory.create(1);
        p.print();
    }
}
