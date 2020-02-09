public class Pokemon{
    private String name;
    private int level;
    private int hp;
    private int pp;

    public Pokemon1(){
        this.name = "Froakie";
        this.level = 1;
        this.hp = 41;
        this.pp = 56;
    }

    public Pokenmon2(){
        this.name = 'Pichu';
        this.level = 1;
        this.hp = 20;
        this.pp = 40;
    }

    public void useBerry(){
        this.hp += 20;
    }

    public void sleep(){
        this.hp += 25;
    }

    public void faint(){
        this.hp = 0;
    }
}