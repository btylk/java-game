import java.util.ArrayList;

public class Bag {

    private ArrayList<Item> items;
    private int bagsize;
    public Bag(){
        items = new ArrayList<Item>();
        bagsize = 30;
    }

    public Item getItem(int index){
        if(index < items.size()){
            return items.get(index);
        }
        else{
            System.out.println("Not Found");
            return null;
        }
    }

    public void addItem(Item newItem){
        if(items.size() < bagsize){
            items.add(newItem);
        }
        else{
            System.out.println("Full");
        }
    }

    public int getNumItem(){
        return items.size();
    }

    public void rmItem(int index){
        items.remove(index);
    }

}