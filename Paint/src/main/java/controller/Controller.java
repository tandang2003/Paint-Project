package controller;
import model.ShapeState;
import view.ColorPanel;
import model.ShapeState;
import view.ColorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    ShapeState shapeState;


    public Controller(ShapeState shapeState) {
        this.shapeState = shapeState;
    }



    public ActionListener getColorAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String actionCommand = e.getActionCommand();
                System.out.println(actionCommand);
                int color = Integer.valueOf(actionCommand);
                ShapeState.setCurrColor(ColorPanel.colors[color]);

            }
        };

    }

}
