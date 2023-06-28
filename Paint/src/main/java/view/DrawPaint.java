package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import controller.Controller;
import model.AShape;

public class DrawPaint extends JPanel {

    Controller controller;

    public DrawPaint(Controller controller) {
        this.controller = controller;
        addMouseListener(controller.getMouseListener());
        addMouseMotionListener(controller.getMouseMotionListener());
    }

    @Override
    public void paintComponent(Graphics g) {
        setBackground(Color.WHITE);
        super.paintComponent(g);
        for (AShape shape : controller.getListShape()) {
            shape.draw(g);
        }
    }
}
