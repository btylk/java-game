
public class Potion extends Item{

    protected int forHP;
    protected int forMP;

    public Potion(){
        super("Potion");
        forHP = 25;
        forMP = 35;
    }

    public int getForHp(){
        return forHP;
    }

    public int getForMp(){
        return forMP;
    }

}