package fluentInterface;

public class MainTest {


    public static void main(String[] args){
        Order pedido = new Order()
                .consumer("32212010","Maria",12,"Feminino")
                .with("Maria",23L,12L);

        System.out.println(pedido);
    }

}
