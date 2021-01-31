package decorator;

public class ActorDecorator extends Decorator {

    public ActorDecorator(Person p) {
        super(p);
    }

    @Override
    public void show() {
    p.show();
        System.out.println("I am still a international actor. ");
    }
}
