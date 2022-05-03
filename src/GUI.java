import javax.swing.*;
import java.awt.*;
public class GUI extends JPanel {
    //where other GUI widgets go
    JButton button1;
    JButton button2;
    JTextField text;
    JLabel label;

    public GUI(int width, int height) {
        System.out.println("GUI constructor.");
        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);
        button1 = new JButton("yes"); //buttons for the GUI
        button1.setBounds(0,0,100,40);
        button2 = new JButton("no");
        button2.setBounds(0,60,100,40);
        text = new JTextField("answer?");
        text.setBounds(0,120,100,40);
        label = new JLabel("This label tells you what to do.");
        label.setBounds(120,0,200,40);
        add(button1);
        add(button2);
        add(text);
        add(label);
    }
}
