import java.awt.Container; //ต้องใช้
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.awt.Desktop.Action;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.SpringLayout.Constraints;

public class testGui extends JFrame{

    public testGui(){
        super("GUI");

    Container c = getContentPane();
    JLabel label = new JLabel("Test Gui");

    c.add(label);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 200);
    setVisible(true);
    }

    /*public static void main(String[] args){
        new testGui();
    }*/
}