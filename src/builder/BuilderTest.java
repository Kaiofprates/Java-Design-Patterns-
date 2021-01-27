package builder;

public class BuilderTest {
    public static void main(String[] args){
        Pizza pizza = new Pizza.Builder(30)
                .tomate()
                .queijo()
                .build();
        System.out.println(pizza.toString());


        Info info = new Info.Builder()
                .conductivity("Higth")
                .water(0.9f)
                .build();


        System.out.println(info.toString());

    }
}
