package controller;

import model.ShapeState;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private ShapeState shapeState;
    public ActionListener getColorAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        };
    }
}
