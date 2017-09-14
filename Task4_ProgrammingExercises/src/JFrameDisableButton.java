import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener{
    JButton button = new JButton("Click me!");
    JLabel label = new JLabel("Activated");
    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 100;

    public JFrameDisableButton() {
        super("Button will be disabled after pressing");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(button);
        add(label);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
        label.setText("Disabled");
    }

    public static void main(String[] args) {
        JFrameDisableButton jFrameDisableButton = new JFrameDisableButton();
        jFrameDisableButton.setVisible(true);
    }
}
