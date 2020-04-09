import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testGui3 extends JFrame{
    private JTextField jtf;

    public testGui3(){
        super("Test text");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel j1 = new JLabel("Enter your name:");
        jtf = new JTextField(25);
        c.add(j1);
        c.add(jtf);

        jtf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {System.out.println(" You entered " + e.getActionCommand());
            jtf.setText("");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,100);
        setVisible(true);
    }
}