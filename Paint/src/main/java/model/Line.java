 package model;

import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Line extends AShape {
	private Point p1;
	private Point p2;
	private Color color;
	private boolean fill = false;

	public Line() {
	}

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.color = Color.black;
	}

	public Line(Point p1, Point p2, Color color) {
		this.p1 = p1;
		this.p2 = p2;
		this.color = color;

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

	@Override
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFill() {
		return fill;
	}

	@Override
	public void setP1(int x, int y) {
		// TODO Auto-generated method stub
		setP1(new Point(x, y));
	}

	@Override
	public void setP2(int x, int y) {
		// TODO Auto-generated method stub
		setP2(new Point(x, y));
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(this.color);
		if (!isFill()) {
			g2d.setStroke(new BasicStroke());
			g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
		}
	}

	@Override
	public boolean getFill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void drawAgain(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(this.color);
		g2d.setStroke(new BasicStroke());
		g2d.drawLine(p1.x, p1.y, p2.x, p2.y);

	}

}
