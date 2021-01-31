package adapter.listView;

public class ListView {
    private Adapter adapter;

    public void setAdapter(Adapter adapter){
        this.adapter = adapter;
    }

    public void show(){
        String[] data = adapter.createUI();
        for(String str: data){
            System.out.println(str);
        }
    }
}
