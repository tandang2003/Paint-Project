
package model;

import java.awt.Color;
import java.util.ArrayList;


public class ShapeState {
    public static AShape currShape = new Line();
    public static int typeShape = 1;
    public static Color currColor = Color.black;
    public static ArrayList<AShape> listShape = new ArrayList<>();

    public static void createShape() {
        currShape = getShape();
        currShape.setColor(currColor);
    }

    public static void setCurrColor(Color color) {
        currColor = color;
    }
    //set shape indexing
    public static void setShapeIndexing(int shapeindex ) {
        typeShape = shapeindex;
    }

    private static AShape getShape() {
        switch (typeShape){
            case 1:
                return new Line();
            case 2:
                return new Circle();
            case 3:
                return new Rectangle();
            case 5:
                return new Square();
            case 7:
                return new Rhombus();
            case 8:
                return new Pencil();
        }
        return currShape;
    }

}

