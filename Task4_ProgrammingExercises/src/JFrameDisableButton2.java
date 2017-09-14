import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener{
    JButton button = new JButton("Click me!");
    JLabel label = new JLabel("Activated");
    JLabel counter = new JLabel("Times pressed: 0");
    int clicked = 0;
    final int FRAME_WIDTH = 500;
    final int FRAME_HEIGHT = 100;

    public JFrameDisableButton2() {
        super("Button will be disabled after clicking it 8 times");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(10));
        add(button);
        add(label);
        add(counter);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicked++;
        counter.setText("Times clicked: " + clicked);
        if (clicked == 8) {
            button.setEnabled(false);
            label.setText("That's enough!");
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton2 jFrameDisableButton2 = new JFrameDisableButton2();
        jFrameDisableButton2.setVisible(true);
    }
}
