package model;

import java.awt.*;

public class ShapeState {
    private AShape curShape;


    public ShapeState(AShape curShape) {
        this.curShape = curShape;
    }

    public void setNewColor(Color color){
        curShape.setColor(color);
    }
    public void setCurShape(int i){

    }
}
