import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testGui2 extends JFrame{

    private int pressCount = 1;

    public testGui2(){

        super("Testing JButton");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton jb = new JButton("Press me");
        c.add(jb);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {System.out.println("Press" + pressCount++);}
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}