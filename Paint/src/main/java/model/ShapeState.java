

package model;

import java.awt.Color;
import java.util.ArrayList;


public class ShapeState {

    public static AShape currShape = new Line();
    public static int typeShape = 1;
    public static Color currColor = Color.black;
    public static ArrayList<AShape> listShape = new ArrayList<>();

    public static void add() {
        currShape.setColor(currColor);
        listShape.add(currShape);
        currShape = getShape();
    }

    public static void createShape() {
        currShape = getShape();
        currShape.setColor(currColor);
    }

    public static void setCurrColor(Color color) {
        currColor = color;
    }

    private static AShape getShape() {
        switch (typeShape) {
            case 0:
                return new Rhombus();
            case 1:
                return new Line();
            case 2:
                return new Square();


        }
        return currShape;
    }

}

