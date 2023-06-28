package model;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.RenderingHints;
import java.awt.BasicStroke;


public class Line extends AShape {
    public Line(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }


    public Line(Point p1, Point p2) {
        super(p1, p2);
    }


    public Line() {
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setColor(this.color);
        g2d.setStroke(new BasicStroke());
        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

}
