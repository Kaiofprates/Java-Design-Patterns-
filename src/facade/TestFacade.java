package facade;

public class TestFacade {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.sing();
        System.out.println("--------------------------");
        facade.dance();
        System.out.println("--------------------------");
        facade.act();
    }

}
