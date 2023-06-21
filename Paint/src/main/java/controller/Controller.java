package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    public ActionListener getColorAction() {


        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                System.out.println(actionCommand);
            }
        };
    }
}
