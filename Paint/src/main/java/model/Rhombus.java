package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rhombus extends AShape {
	private Point p1;
	private Point p2;
	private Color color;
	private boolean fill = false;

	public Rhombus() {
	}

	public Rhombus(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.color = Color.black;
	}

	public Rhombus(Point p1, Point p2, Color color) {
		this.p1 = p1;
		this.p2 = p2;
		this.color = color;
	}

	@Override
	public void setP1(int x, int y) {
		setP1(new Point(x, y));
	}

	@Override
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
	public void draw(Graphics g) {
//		Pencil.point.clear();
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke());
		g2d.setColor(this.color);
		int[] x = { p1.x, p2.x, p1.x, LastPointX() };
		int[] y = { p1.y, p2.y, ThirdPointY(), p2.y };
		if (!isFill()) {
			g2d.drawPolygon(x, y, 4);
//			System.out.println(Pencil.point);
			System.out.println(p1.x);
			System.out.println(p1.y);
			System.out.println(p2.x);
			System.out.println(p2.y);
		} else
			g2d.fillPolygon(x, y, 4);
	}

	public int ThirdPointY() {
		int a = 0;
		int j = Math.abs(p1.x - p2.x);
		int i = Math.abs(p1.y - p2.y);
		a = p1.y > p2.y ? p1.y - 2 * i : p1.y + 2 * i;
//	System.out.println(p2.y);
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

	@Override
	public boolean getFill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void drawAgain(Graphics g) {
//		Pencil.point.clear();
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke());
		g2d.setColor(this.color);
		int[] x = { p1.x, p2.x, p1.x, LastPointX() };
		int[] y = { p1.y, p2.y, ThirdPointY(), p2.y };
		if (!isFill()) {
			g2d.drawPolygon(x, y, 4);
//			System.out.println(Pencil.point);
		} else
			g2d.fillPolygon(x, y, 4);
	}

}
