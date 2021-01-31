package decorator;

public class ManagerDecorator extends Decorator{

    public ManagerDecorator(Person p) {
        super(p);
    }

    @Override
    public void show() {
    p.show();
        System.out.println("I am still a manager");
    }
}
