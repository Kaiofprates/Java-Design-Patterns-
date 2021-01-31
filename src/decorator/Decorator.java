package decorator;

public  abstract class Decorator implements Person{
    protected Person p;

    public Decorator(Person p){
        this.p = p;
    }
}
