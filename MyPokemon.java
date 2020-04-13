import java.util.*;

public class MyPokemon {

    protected int hp;
    protected int mp;
    protected int exp;
    protected int level;
    protected int maxHp;
    protected int maxMp;
    protected int myDmg;
    protected int winCount;
    private String pokeName;
    private String evoStep;
    protected ArrayList<Skill> skills;
    public Bag myBag;
    protected String pokePic;

    public MyPokemon(String nickName, String evo){

        this.pokeName = nickName;
        evoStep = evo;
        level = 1;
        maxHp = 0;
        maxMp = 0;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        myDmg = 0;
        winCount = 0;
        skills = new ArrayList<Skill>();
        myBag = new Bag();
        pokePic = "";

    }

    public String getName(){
        return pokeName;
    }

    public String getEvoStep(){
        return evoStep;
    }

    public int getmaxHp(){
        return maxHp;
    }

    public int gethp(){
        return hp;
    }

    public int getMaxMp(){
        return maxMp;
    }

    public int getMp(){
        return mp;
    }

    public int getexp() {
        return exp;
    }

    public int getlvl() {
        return level;
    }
    public int getDmg(){
        return myDmg;
    }

    public int getWinCount(){
        return winCount;
    }
    
    public void expgain(int expIncome) {
        exp = exp + expIncome;
        winCount++;
        lvlup();
    }

    public void dmgToHp(int dmg) {
        hp = hp - dmg;
        if(hp < 0){
            hp = 0;
        }
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

    public void useMp(int used){
        mp -= used;
    }

    public void lvlup() {
        while (exp >= level * 10) {
            exp = exp - (level * 10);
            level++;
            maxHp = maxHp + 20;
            maxMp = maxMp +10;
            hp = maxHp;
            mp = maxMp;
            myDmg += 5;
            System.out.println("Level Up!!!!!");
        }
    }
    
    /*public boolean isPlayerDie(){
        if(hp == 0){
            return true;
        }
        return false;
    }

    public void resurrection(){
        hp = maxHp / 2;
        mp = maxMp / 2;
    }*/
    
    public int getnumberskill(){
        return skills.size();
    }

    public Skill getSkill(int index){
        return skills.get(index);
    }

    public String getPic(){
        return pokePic;
    }

}