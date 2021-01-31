package prototype.person;

public class Prototype implements Cloneable{
    private String name;
    private Person person;

    public Prototype(String name){
        super();
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person = person;
    }

    protected Object clone(){
        Prototype p = null;
        try {
            p = (Prototype) super.clone();

            if(person != null){
                Object obj = person.clone();
                p.person = (Person) obj;
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
