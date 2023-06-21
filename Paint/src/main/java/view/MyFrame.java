package view;

import controller.Controller;
import model.ShapeState;


import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyPanel panel;

    public MyFrame(Controller controller) {
        panel = new MyPanel(controller);
        add(panel);
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void repaintDrawPaint() {
        panel.repaintDrawPaint();
    }
}
