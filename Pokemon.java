public class Pokemon{
    private String name;
    private int level;
    private int energy;
    private int hp;
    private int pp;

    public Pokemon(String n){
        this.name = n;
        this.level = 1;
        this.energy = 30;
        this.hp = 41;
        this.pp = 56;
    }

    public void Pokemon2(){
        this.name = "Chamander";
        this.level = 1;
        this.energy = 19;
        this.hp = 20;
        this.pp = 40;
    }

    public void useBerry(){
        this.hp += 20;
        this.energy += 10;
    }

    public void sleep(){
        this.hp += 25;
    }

    public void faint(){
        this.hp = 0;
    }

    public void run(){
        this.energy -= 5;
    }

    public void attack(){
        this.energy -= 10;
    }

    public void printStatus(){
        System.out.println("Name= "+this.name);
        System.out.println("Level= "+this.level);
        System.out.println("Energy= "+this.energy);
        System.out.println("HP= "+this.hp);
        System.out.println("PP= "+this.pp);
    }
}