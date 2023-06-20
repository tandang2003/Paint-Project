package view;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel panel;

    public MyFrame() {
        panel = new MyPanel();
        add(panel);
//        pack();
//        setSize(800,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        // Test merge on github
        new MyFrame();
    }
}
