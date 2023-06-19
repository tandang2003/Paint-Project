package view;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel panel;

    public MyFrame() {
        panel = new MyPanel();
        add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    int plus(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        // Test merge on github
        new MyFrame();
    }
}
