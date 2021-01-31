package prototype.basic;

public class TestClone {
    public static void main(String[] args){
        Prototype p = new Prototype("David");
        System.out.println(p.getName());
        System.out.println("-----------");
        Prototype p2 = (Prototype) p.clone();
        System.out.println(p2.getName());
    }
}
