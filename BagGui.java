import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BagGui extends JFrame{

    ArrayList<JButton> buttons;
    int num;
    public BagGui(Player player,int state){
        super("Inventory");
        num = state;
        buttons = new ArrayList<JButton>();
        Bag bag = player.myBag;
        Container container = getContentPane();
        container.setLayout(new GridLayout(3,1));
        JPanel list = new JPanel();
        JLabel nameList = new JLabel("Item List");
        list.add(nameList);
        container.add(list);
        JPanel panel = new JPanel();
        JLabel itemPanel = new JLabel();
        itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));
        panel.add(itemPanel);
        for(int i = 0; i < bag.getNumItem(); i++){
            buttons.add(new JButton(bag.getItem(i).getItemName()));
            itemPanel.add(buttons.get(i));
            buttons.get(i).addActionListener(new InnerBagGui(i,player));
        }
        container.add(panel);
        JPanel panel2 = new JPanel();
        JButton back = new JButton("Back");
        panel2.add(back);
        container.add(panel2);
        back.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                if(num == 1){
                    new PlayerInfoGui(player);
                }

                dispose();
            }
        });

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /*public static void main(String[] args){
        new BagGui();
    }*/

    public class InnerBagGui implements ActionListener{
        int i;
        Player player;
        
        public InnerBagGui(int index, Player player){
            i = index;
            this.player = player;
        }

        public void actionPerformed(ActionEvent e){
            player.usePotion(player.myBag.getItem(i));
            player.myBag.rmItem(i);
            if(num == 1){
                new PlayerInfoGui(player);
            }

            dispose();
        }
    }

}