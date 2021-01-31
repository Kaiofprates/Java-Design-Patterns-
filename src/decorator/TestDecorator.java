package decorator;

public class TestDecorator {
    public static void main(String[] args){
        Person p = new Man();
        p.show();

        p = new ManagerDecorator(p);
        p.show();

        p = new ActorDecorator(p);
        p.show();
    }
}
