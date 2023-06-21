package view;

import javax.swing.*;
import java.awt.*;

public class ShapeButton extends JButton {
    static int padding = 5;
    int shapeType;

    //constructor
    public ShapeButton(int shapeType) {
        this.shapeType = shapeType;
        setPreferredSize(new Dimension(40, 40));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        switch (shapeType) {
            case ShapPanel.LINE:
                g.drawLine(padding, padding, getWidth() - padding, getHeight() - padding);
                break;
            case ShapPanel.CIRCLE:
                g.drawOval(padding, padding, getWidth() - 2 * padding, getHeight() - 2 * padding);
                break;
            case ShapPanel.REC:
                g.drawRect(padding, padding * 2, getWidth() - 2 * padding, getHeight() - 4 * padding);
                break;
            case ShapPanel.TRIANGLE:
                g.drawLine(padding, padding, getWidth() - padding, padding);
                g.drawLine(getWidth() - padding, padding, getWidth() - 4 * padding, getWidth() - padding);
                g.drawLine(getWidth() - 4 * padding, getWidth() - padding, padding, padding);
                break;
            case ShapPanel.SQUARE:
                g.drawRect(padding * 2, padding * 2, getWidth() - 4 * padding, getHeight() - 4 * padding);
                break;
        }
    }
}
