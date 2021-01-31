package adapter.listView;

public class TestAdapter {
    public static void main(String[] args){
        String[] data = {
                "Happy Strong Family",
                "Easy Learning Java",
                "Easy Learning Python3",
                "Easy learning HTML CSS",
                "Easy Learning Javascript"
        };

        ListView listView = new ListView();
        listView.setAdapter(new ArrayAdapter(data));
        listView.show();

        System.out.println("-------------------------------");

        listView.setAdapter(new BaseAdapter(data));
        listView.show();


    }
}
