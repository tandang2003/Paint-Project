package model;

import java.awt.*;

public abstract class AShape {
    private Point p1;
    private Point p2;
    private Color color;

    public AShape(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        color= Color.BLACK;
    }

    public abstract void draw(Graphics g);

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
