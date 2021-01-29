package fluentInterface;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
class Item {
    public String cliente;
    public Long  mesa;
    public Long produto;

    public Item(String cliente, long mesa, long produto) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.produto = produto;
    }
}

@Builder
@Data

class Cliente {
    public String cpf;
    public String name;
    public long idade;
    public String sexo;
}

@Data
public class Order {
    List<Item> items;
    Cliente cliente;

    Order with(String cliente, Long mesa, Long produto){

        Item order = Item.builder()
                .cliente(cliente)
                .mesa(mesa)
                .produto(produto)
                .build();

        items.add(order);

        return this;
    }

    Order consumer(String cpf, String name, long idade, String sexo){
        cliente = new Cliente(cpf,name,idade,sexo);
        return this;
    }

}
