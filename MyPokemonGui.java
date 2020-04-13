import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPokemonGui extends JFrame{

    public MyPokemonGui(MyPokemon mypokemon){
        super("Pokemon Info");
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel status = new JPanel();
        status.setLayout(new BoxLayout(status,BoxLayout.Y_AXIS));
        JLabel mypokemonLabel =new JLabel("Nick Name : " + mypokemon.getName());
        JLabel mypokemonEvo = new JLabel("Evo : " + mypokemon.getEvoStep());
        JLabel mypokemonLV = new JLabel("Level : " + mypokemon.getlvl() + "  EXP : " +mypokemon.getexp());
        JLabel mypokemonHP = new JLabel("HP : " + mypokemon.gethp() + " / " + mypokemon.getmaxHp());
        JLabel mypokemonMp = new JLabel("MP : " + mypokemon.getMp() + " / " + mypokemon.getMaxMp());
        JLabel winCount = new JLabel("Win Count : " + mypokemon.getWinCount());
        status.add(mypokemonLabel);
        status.add(mypokemonEvo);
        status.add(mypokemonLV);
        status.add(mypokemonHP);
        status.add(mypokemonMp);
        status.add(winCount);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        p2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        ImageIcon iconlogo = new ImageIcon("Logo3.png");
        JLabel logo = new JLabel(iconlogo);
        p2.add(logo);
        container.add(logo,BorderLayout.NORTH);
        ImageIcon pokeImg = new ImageIcon(mypokemon.getPic());
        JLabel pokePic =new JLabel(pokeImg);
        p2.add(pokePic);
        p2.add(status);
        container.add(p2,BorderLayout.CENTER);
        JButton battleArena = new JButton("Battle Arena");
        JButton pokeball = new JButton("Pokeball");
        JButton bag = new JButton("Bag");
        JPanel select = new JPanel();
        select.setLayout(new FlowLayout());
        select.add(battleArena);
        select.add(pokeball);
        select.add(bag);
        container.add(select,BorderLayout.SOUTH);
        /*if(mypokemon.getlvl()>=10 && mypokemon.getJobClass().equals("Novice")){
            changeClass.setVisible(true);
        }*/
        /*goFight.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new MonsterSelect(mypokemon);
                dispose();
            }
        });*/
        /*ag.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new BagGui(mypokemon,1);
                dispose();
            }
        });*/
        /*changeClass.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new ClassChangeGUI(mypokemon);
                dispose();
            }
        });*/
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}