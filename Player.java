import java.util.*;

public class Player {
    protected int level;
    protected String name;
    protected String playerImg;
    //public Bag myBag;
    public Player(String newName){
        this.name = newName;
        level = 1;
        playerImg = "";
    }

    public String getName(){
        return name;
    }

    public int getlvl(){
        return level;
    }

    public String getPic(){
        return playerImg;
    }
}