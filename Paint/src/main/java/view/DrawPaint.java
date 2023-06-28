package view;

import controller.Controller;
import model.AShape;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

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
