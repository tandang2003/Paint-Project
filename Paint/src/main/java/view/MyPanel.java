package view;

import controller.Controller;
import model.ShapeState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    ColorPanel colorPanel;
    ShapPanel shapPanel;
    DrawPaint drawPaint;

    MyPanel(Controller controller) {
        colorPanel = new ColorPanel(controller);
        shapPanel = new ShapPanel(controller);
        drawPaint = new DrawPaint(controller);
        this.setBounds(0, 0, 500, 400);
        this.setBackground(Color.CYAN);
        this.setLayout(new BorderLayout());
        this.add(colorPanel, BorderLayout.NORTH);
        this.add(shapPanel, BorderLayout.WEST);
        this.add(drawPaint, BorderLayout.CENTER);
    }

    public void repaintDrawPaint() {
        drawPaint.repaint();
    }
}
