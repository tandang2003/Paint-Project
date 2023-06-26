package model;

import java.awt.*;

public class Square extends AShape {
    public Square(Point p1, Point p2, Color color) {
        super(p1, p2, color);
// test smartgit 123
    }

    public Square(Point p1, Point p2) {
        super(p1, p2);
    }

    public Square() {
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke());
        g2d.setColor(this.color);
        g2d.drawRect(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), Math.abs(p1.x - p2.x), Math.abs(p1.x - p2.x));
    }
}
