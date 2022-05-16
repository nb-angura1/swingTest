import javax.swing.*;
import java.awt.*;

public class GUITwo extends JPanel{

    private JFrame frame;

    public GUITwo(int width, int height){
        frame = new JFrame("Demo"); //initialising the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //disposes the window when closed without closing the entire program
        frame.setSize(300, 300);

        frame.getContentPane().add(this);//canvas to hold the graphics

        frame.setVisible(true);//displays the frame after adding the panel to avoid drawing errors
    }
    @Override
    public void paintComponent(Graphics g) {
        int left = 50;    // hard-coded just for testing
        int top = 80;
        int width = 40;
        int height = 150;
        g.setColor(Color.lightGray);
        g.fillRect(left, top, width, height);
    }


}
