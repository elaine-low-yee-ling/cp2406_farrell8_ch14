import javax.swing.*;

public class JBookQuote {

    public static void main(String[] args) {
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 100;
        JFrame jFrame = new JFrame("Book Quote");

        jFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel quote = new JLabel("Now I know I've got a heart because it is breaking.");
        jFrame.add(quote);
    }
}
