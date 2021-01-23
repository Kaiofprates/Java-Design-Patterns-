package composite;

import java.util.ArrayList;
import java.util.List;

public class Node {
    protected String name;
    protected List<Node> childNodes;

    public Node(String name){
        super();
        this.name = name;
        this.childNodes = new ArrayList<Node>();
    }

    public void add(Node node){
        childNodes.add(node);
    }

    public String getName(){
        return this.name;
    }


    public void setName(String name){
        this.name = name;
    }

    public  List<Node> getChildNodes(){
        return childNodes;
    }

}
