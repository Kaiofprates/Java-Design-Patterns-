package composite;

import java.util.List;

public class MainTest {

    /*
    * Composite Pattern
    *
    * Entende-se por Composite um padrão de projeto de software utilizado para representar
    * um objeto formato pela composição de objetos similares. Este conjunto de objetos pressupõe
    * uma mesma hierarquia de classes a que ele pertence. Tal padrão é, normalmente, utilizado para
    * representar listas recorrentes ou recursivas de elementos. Como estrutura hierárquica e estrutura em árvore.
    * */

    public static void main(String[] args){
        Tree tree = new Tree("World");
        Node root  = tree.getRoot();

        Node china = new Node("China");
        Node america = new Node("América");
        root.add(china);
        root.add(america);

        Node beijing = new Node("Bei Jing");
        Node shanghai = new Node("Shan Hai");
        china.add(beijing);
        china.add(shanghai);

        Node sanfrancisco = new Node("San Francisco");
        Node newyork = new Node("New York");
        america.add(sanfrancisco);
        america.add(newyork);

        System.out.println(root.getName());

        List<Node> childNodes = root.getChildNodes();

        for(Node node : childNodes){
            System.out.println("-----" + node.getName());

            List<Node> childNodes2 = node.getChildNodes();
            for(Node node2: childNodes2){
                System.out.println("-----------" + node2.getName());
            }
        }
    }
}
