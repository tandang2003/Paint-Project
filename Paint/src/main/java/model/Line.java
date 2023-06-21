package model;

import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


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
        g2d.setColor(this.color);
        g2d.setStroke(new BasicStroke());
        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

}
