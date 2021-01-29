package Factory;

public class Factory {
    public static Product create(int type){
        Product p = null;
        if(type == 0){
            p = new Computer();
        }else if(type == 1){
            p = new Mouse();
        }
        return p;
    }
}
