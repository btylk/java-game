
public class Froakie extends MyPokemon{

    public Froakie(String nickName){
        super(nickName, "Froakie");
        maxHp = 50;
        maxMp = 30;
        hp = maxHp;
        mp = maxMp;
        exp = 0;
        myDmg = 10;
        //skills.add(new NormalAttack(myDmg));
        pokePic = "Froakie2.png";
    }
    
}