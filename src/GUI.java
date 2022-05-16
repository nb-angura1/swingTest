import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    //where other GUI widgets go
    JButton button1;
    JButton button2;

    JTextField text;

    JLabel label;

    private JFrame frame;
    private JButton newGraph;

    public GUI(int width, int height) {
        System.out.println("GUI constructor.");
        this.setPreferredSize(new Dimension (width, height));
        setLayout(null);

        button1 = new JButton("yes"); //buttons for the GUI
        button1.setBounds(0,0,100,40);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Welcome to Java");
            }
        });

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

        frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0, 400, 300);
        frame.setLayout(null);
        newGraph = new JButton("Graph results");
        newGraph.setBounds(50, 50, 120, 40);
        newGraph.addActionListener(this);
        frame.getContentPane().add(newGraph);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Graph results")){
            System.out.println("click");
            GUITwo test = new GUITwo(2,4);
        }
    }
}
