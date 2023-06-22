package controller;

import model.AShape;
import model.Point;
import model.ShapeState;
import view.ColorPanel;
import model.ShapeState;
import view.ColorPanel;
import view.MyFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    MyFrame myFrame;
    List<AShape> listShape = new ArrayList<>();

    public Controller() {
        initView();
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

    public void initView() {
        myFrame = new MyFrame(this);
    }

    public void repaintDrawPaint() {
        myFrame.repaintDrawPaint();
    }

    public List<AShape> getListShape() {
        return listShape;
    }

    public MouseListener getMouseListener() {
        return new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ShapeState.createShape();
                listShape.add(ShapeState.currShape);
                ShapeState.currShape.setP1(new Point(e.getX(),e.getY()));
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                ShapeState.currShape.setP2(new Point(mouseEvent.getX(),mouseEvent.getY()));
                repaintDrawPaint();
                ShapeState.createShape();
            }
        };
    }

    public static void main(String[] args) {
        new Controller();
    }

    public MouseMotionListener getMouseMotionListener() {
        return new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                ShapeState.currShape.setP2(new Point(mouseEvent.getX(),mouseEvent.getY()));
                repaintDrawPaint();
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        };
    }
}
