import java.awt.Container; //ต้องใช้
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import javax.swing.SpringLayout.Constraints;

public class testGui extends JFrame /* v.4 inner class implements ActionListener*/{

    // v.5 no global required private JMenuItem openItem, quitItem; //v.3 add action
    public testGui(){ //v.1 create pane
        super("GUI");

        makeMenuBar();
        Container c = getContentPane();
        JLabel label = new JLabel("Test Gui");

        c.add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    private void makeMenuBar(){ //v.2 create menu
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {openFile();}
        });
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {System.exit(0);}
        });
        fileMenu.add(quitItem);
    }

    /*class MenuHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Object src = event.getSource();
            if(src == openItem)
                openFile();
            else if(src == quitItem)
                System.exit(0);
            else
                System.out.println("Cannot process action event for" + event.getActionCommand());
        }
    }*/

    private void openFile(){
        System.out.println("open file");
    }
    
    /*public static void main(String[] args){
        new testGui();
    }*/
}