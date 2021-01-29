package singleton;

public class TestSingleton {

    public static void main(String[] args){

        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        s1.setName("Kaio");

        System.out.println(s1.greeter());
        System.out.println(s2.greeter());
    }

}
