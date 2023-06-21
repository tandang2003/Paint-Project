package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel panel;

    public MyFrame(Controller controller) {
        panel = new MyPanel(controller);
        add(panel);
//        pack();
        setSize(800,800);


        // vu xuan chien test
        setVisible(true);
//        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        // Test merge on github
        new MyFrame(new Controller());
    }
}
