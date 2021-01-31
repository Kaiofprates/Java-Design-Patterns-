package prototype.basic;

public class Prototype implements Cloneable{
    private String name;

    public Prototype(String name){
        super();
        this.name = name;
    }

    public  String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    protected Object clone(){
        Prototype p = null;

        try{
            p = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
