package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rhombus extends AShape {
    public Rhombus(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }

    public Rhombus(Point p1, Point p2) {
        super(p1, p2);
    }

    public Rhombus() {
    }

    @Override
    public void draw(Graphics g) {
//		Pencil.point.clear();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke());
        g2d.setColor(this.color);
        int[] x = {p1.x, p2.x, p1.x, LastPointX()};
        int[] y = {p1.y, p2.y, ThirdPointY(), p2.y};
        g2d.drawPolygon(x, y, 4);
    }

    public int ThirdPointY() {
        int a = 0;
        int j = Math.abs(p1.x - p2.x);
        int i = Math.abs(p1.y - p2.y);
        a = p1.y > p2.y ? p1.y - 2 * i : p1.y + 2 * i;
        return a;
    }

    public int LastPointX() {
        int a = 0;
        int i = Math.abs(p1.x - p2.x);
        if (p1.x > p2.x) {
            a = p1.x + i;
            return a;
        } else {
            a = p1.x - i;
            return a;
        }
    }
}
