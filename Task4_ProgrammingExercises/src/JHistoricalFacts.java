import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class JHistoricalFacts extends JFrame implements ActionListener{
    JButton button = new JButton("Click me!");
    JLabel labelOne = new JLabel("");
    JLabel labelTwo = new JLabel("");
    JLabel labelThree = new JLabel("");
    JLabel labelFour = new JLabel("");
    JLabel labelFive = new JLabel("");
    JLabel[] labelsBank = {
            labelOne, labelTwo, labelThree, labelFour, labelFive
    };
    String[] factsBank = {
            "1) The Ottoman Empire's Sultan Ibrahim I had 280 of his concubines drowned in the ocean after one of them slept with another man.",
            "2) In medieval times, people were put to death for being witches. One anthropologist conjectures as many as 600,000 witches lost their lives. ",
            "3) Mexican General Santa Anna had an elaborate state funeral for his amputated leg.",
            "4) Tens of thousands of baby girls were abandoned each year in China because of the country's one-child policy.",
            "5) Before the mid-19th century, dentures were commonly made with teeth pulled from the mouths of dead soldiers.",
            "6) Roman Emperor Gaius made his beloved horse a senator.",
            "7) Ice age Britons used skulls of the dead as cups.",
            "8) After Pope Gregory IX associated cats with devil worship, cats throughout Europe were exterminated in droves.",
            "9) This sudden lack of cats led to the spread of disease because infected rats ran free. The most devastating of these diseases, the Bubonic Plague, killed 100 million people.",
            "10) The Aztecs made human sacrifices to the gods. In 1487, at the dedication of the temple in Tenochtitlan, 20,000 people were put to death.",
            "11) The Mayans also made sacrifices. The most common involved pulling a still-beating heart out of a victim's chest.",
            "12) In the 13th century 30,000 children went on what is known as the Children's Crusade. They were convinced God would allow them to take back the Holy Land without incident, but most died on the journey or were sold into slavery.",
            "13) In ancient Egypt, servants were smeared with honey in order to attract flies away from the pharaoh.",
            "14) Upon dying, some pharaohs were sealed into their tombs alongside their living servants, pets, and concubines."
    };
    final int FRAME_WIDTH = 1000;
    final int FRAME_HEIGHT = 300;

    public JHistoricalFacts() {
        super("Display a random fact after clicking the button");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(labelOne);
        add(labelTwo);
        add(labelThree);
        add(labelFour);
        add(labelFive);
        add(button);

        button.addActionListener(this);
        labelOne.setText(factsBank[0]);
        labelTwo.setText(factsBank[1]);
        labelThree.setText(factsBank[2]);
        labelFour.setText(factsBank[3]);
        labelFive.setText(factsBank[4]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 14);
        int randomLabelNum = ThreadLocalRandom.current().nextInt(0, 5);
        labelsBank[randomLabelNum].setText(factsBank[randomNum]);
    }

    public static void main(String[] args) {
        JHistoricalFacts jHistoricalFacts = new JHistoricalFacts();
        jHistoricalFacts.setVisible(true);
    }
}
