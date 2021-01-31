package prototype.person;

public class TestDeepClone {
    public static void main(String[] args){
        Prototype p = new Prototype("David");
        p.setPerson(new Person(20));
        System.out.println(p.getName() + "," + p.getPerson().getAge());
        System.out.println("----------------------");
        Prototype p2 = (Prototype) p.clone();
        System.out.println(p2.getName() + "," + p.getPerson().getAge());
    }
}
