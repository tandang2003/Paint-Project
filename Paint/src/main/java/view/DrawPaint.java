package view;

import controller.Controller;
import model.AShape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPaint extends JPanel {
    List<AShape> listShape= new ArrayList<>();
    AShape lastShape=null;
    boolean isFill;
    Controller controller;
    public DrawPaint(Controller controller) {
        this.controller=controller;
    }
    @Override
    public void paintComponent(Graphics g){
        setBackground(Color.WHITE);
        super.paintComponent(g);
        for( AShape shape : listShape){
//            shape.draw(g);
        }
    }
}
