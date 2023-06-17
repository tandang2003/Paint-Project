package view;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel panel;

    public MyFrame() {
        panel= new MyPanel();
        add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
