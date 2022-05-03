import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("STart");
        JFrame frame = new JFrame("Demo Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myDisplay = new GUI(600,400);
        frame.add(myDisplay);
        frame.pack();
        frame.setVisible(true);
    }
}
