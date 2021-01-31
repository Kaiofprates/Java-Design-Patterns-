package prototype.person;

public class Person implements Cloneable{
    private int age;

    public Person(int age){
        super();
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    protected Object clone(){
        try {
         return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
