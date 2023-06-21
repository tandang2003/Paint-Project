package model;

import java.awt.*;

public abstract class AShape {
	public abstract void setP1(int x, int y);
    public abstract void setP2(int x, int y);
    public abstract void setColor(Color color);
    public abstract Color getColor();
    public abstract void draw(Graphics g);
    public abstract boolean getFill();
    public abstract void drawAgain(Graphics g) ;
}
