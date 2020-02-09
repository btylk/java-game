public class PokemonGame{
    public static void main (String args[]){
        Pokemon pokemon = new Pokemon1();
        System.out.println("initial status");
        pokemon1.printStatus();

        System.out.println("update stat");
        pokemon1.run();
        pokemon1.attack();
        pokemon1.useBerry();
        pokemon1.sleep();
    }
}