import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener{
    JLabel quote = new JLabel("Now I know I've got a heart because it is breaking.");
    JButton button = new JButton("Click me!");
    JLabel bookTitle = new JLabel("");
    final int FRAME_WIDTH = 400;
    final int FRAME_HEIGHT = 100;

    public JBookQuote2() {
        super("Book Quote with Title");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLayout(new FlowLayout());
        add(quote);
        add(button);
        add(bookTitle);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bookTitle.setText("The Wizard of Oz");
    }

    public static void main(String[] args) {
        JBookQuote2 jBookQuote2 = new JBookQuote2();
        jBookQuote2.setVisible(true);
    }
}
