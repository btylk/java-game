public class Pokemon {
    protected int level;
    protected int hp;
    protected int maxHp;
    protected int exp;
    protected int dmg;
    protected String pic;
    private String name;

    public Pokemon(String newName){
        name = newName;
        maxHp = 0;
        hp = maxHp;
        level = 0;
        dmg = 0;
        pic ="";

    }

    public String getPic(){
        return pic;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public int getHp(){
        return hp;
    }

    public int getMaxHp(){
        return maxHp;
    }

    public int getDmg(){
        return dmg;
    }

    public int getExp(){
        return exp;
    }

    public void takingDmg(int commingDmg){
        hp -= commingDmg;
        if(hp < 0){
            hp = 0;
        }
    }

    public String toString(){
        return "Name :" + name + " Level :" + level + " HP :" + maxHp + "/" + hp;
    }

    public boolean isDie(){
        if(hp == 0){
            return true;
        }
        return false;
    }

}