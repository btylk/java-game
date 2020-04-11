
public class Item {

    protected String itemName;

    public Item(String name){

        itemName = name;
    }

    public String getItemName(){
        return itemName;
    }

    public int getReHp(){
        return 0;
    }

    public int getReMp(){
        return 0;
    }
}