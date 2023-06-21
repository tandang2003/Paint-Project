package model;

import java.awt.*;

public abstract class AShape {


    protected Point p1;
    protected Point p2;
    protected Color color;

    public AShape(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }



    public AShape(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = Color.black;
    }
    public AShape() {
    }


    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        System.out.println(p1.toString());
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        System.out.println(p2.toString());
        this.p2 = p2;

    }

    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }
    public abstract void draw(Graphics g);
}

