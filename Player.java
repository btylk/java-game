import java.util.*;

public class Player {
    protected int level;
    protected int hp;
    protected int mp;
    protected int maxHp;
    protected int maxMp;
    protected int exp;
    protected int winCount;
    protected String playerImg;
    private String name;
    public Bag myBag;
    public Player(String newName){
        this.name = newName;
        level = 1;
        exp = 0;
        myBag = new Bag();
        playerImg = "";
        
    }

    public String getName(){
        return name;
    }

    public int getlvl(){
        return level;
    }

    public int getexp() {
        return exp;
    }

    public void expGain(int expIn){
        exp = exp + expIn;
        winCount++;
        lvlup();
    }

    public void usePotion(Item p){
        hp += p.getForHp();
        mp += p.getForMp();
        if(hp > maxHp){
            hp = maxHp;
        }
        if(mp > maxMp){
            mp = maxMp;
        }
    }

    public void lvlup(){
        while(exp >= level * 10){
            exp = exp - (level * 10);
            level++;
            System.out.println("Level Up!!!!");
        }
    }

    public String getPic(){
        return playerImg;
    }
}