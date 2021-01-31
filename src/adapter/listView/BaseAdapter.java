package adapter.listView;


// adaptador para imagens

public class BaseAdapter implements Adapter {

    private String[] data;

    public BaseAdapter(String[] data){
        this.data = data;
    }

    @Override
    public String[] createUI() {
        for(int i=0; i < data.length; i++){
            data[i] = "Image: "+data[i];
        }
        return this.data;
    }
}
