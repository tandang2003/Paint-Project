package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.RenderingHints;
import java.util.ArrayList;

public class Pencil extends AShape {
    private ArrayList<Point> point = new ArrayList<>();

    public Pencil(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }

    public Pencil() {

    }

    public void addPoint(Point p) {
        point.add(p);
    }

    @Override
    public void draw(Graphics g) {

        Graphics2D g2d = (Graphics2D)  g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setStroke(new  BasicStroke());
        g2d.setColor(this.color);
        if (point.size() > 1) {
            this.p1 = point.get(0);
            for (int i = 1; i < point.size(); i++) {
                this.p2 = point.get(i);
                g2d.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
                this.p1 = this.p2;
            }
        }
    }
}
