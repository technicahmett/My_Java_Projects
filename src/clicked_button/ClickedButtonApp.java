package clicked_button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickedButtonApp {

    public static void main(String[] args) {


        JFrame frame = new JFrame();

        JButton buttonMessage = new JButton();
        buttonMessage.setBounds(20, 120, 100, 30);
        buttonMessage.setText("Message");

        JButton buttonClose = new JButton();
        buttonClose.setBounds(165, 120, 100, 30);
        buttonClose.setText("Close");

        JLabel label1 = new JLabel();
        label1.setBounds(40, 20, 200, 20);


        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonMessage.addActionListener(new ActionListener() {
            int count=1;
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");

                label1.setText("You Clicked to the Button "+count+++" times...");
            }
        });


        frame.add(label1);
        frame.add(buttonMessage);
        frame.add(buttonClose);

        frame.setLocationRelativeTo(null);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// pencereyi kapattığında kodu durduruyor


    }
}
