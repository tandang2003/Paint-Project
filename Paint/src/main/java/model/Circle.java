package model;


import java.awt.Color;
import java.awt.Graphics;

public class Circle extends AShape {
    private Point p1;
    private Point p2;
    private Color color;
    private boolean fill = false;

    public Circle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = Color.black;
    }

    public Circle(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }


    public void setP1(int x, int y) {
        setP1(new Point(x, y));
        ;
    }


    public void setP2(int x, int y) {
        setP2(new Point(x, y));
    }

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

    public boolean isFill() {
        return fill;
    }


    public void setFill(boolean fill) {
        this.fill = fill;
    }


    public void draw(Graphics g) {

        g.setColor(color);

        if (!isFill())
            g.drawOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));
        else
            g.fillOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));

    }
}
