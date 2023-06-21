package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    MyPanel(Controller controller) {
        this.setBounds(0,     0, 500, 400);
        this.setBackground(Color.CYAN);
        setLayout(new BorderLayout());
        this.add(new ColorPanel(controller),BorderLayout.NORTH);

        this.add(new ShapPanel(controller), BorderLayout.WEST);
        this.add(new DrawPaint(controller), BorderLayout.CENTER);
    }
}
