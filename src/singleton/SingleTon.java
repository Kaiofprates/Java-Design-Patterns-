package singleton;

public class SingleTon {

    private String name;

    private static SingleTon instance;

    private SingleTon(){
    }

    public static SingleTon getInstance(){
        if(instance == null){
            // há apenas uma instância
            instance = new SingleTon();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greeter(){
        return "Hello " + this.name;
    }
}
