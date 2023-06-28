package controller;

import model.AShape;
import model.Pencil;
import model.Point;
import model.ShapeState;
import view.ColorPanel;
import view.MyFrame;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    MyFrame myFrame;
    List<AShape> listShape = new ArrayList<>();

    JPanel panel;

    public Controller() {
        initView();
        panel = this.myFrame.getDrawPaint();

    }


    public ActionListener getColorAction() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                int color = Integer.valueOf(actionCommand);
                ShapeState.setCurrColor(ColorPanel.colors[color]);

                System.out.println("chay mau");



            }
        };

    }


    public ActionListener getShapeAction(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("chay shape");
                String shapeActionCommand = e.getActionCommand();
                System.out.println(shapeActionCommand);
                int shapeindex = Integer.valueOf(shapeActionCommand);

                ShapeState.setShapeIndexing(shapeindex);

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


    public MouseMotionListener getMouseMotionListener() {
        return new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                ShapeState.currShape.setP2(new Point(e.getX(),e.getY()));
                if (ShapeState.typeShape == 8){
                    ((Pencil)ShapeState.currShape).addPoint(new Point(e.getX(),e.getY()));
                }
                repaintDrawPaint();
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                ShapeState.currShape.setP1(new Point(mouseEvent.getX(), mouseEvent.getY()));

            }

        };
    }


    public static void main(String[] args) {
        new Controller();
    }


    public ActionListener expAction() {
       return e -> {
           JFileChooser fileChooser = new JFileChooser();
           int result = fileChooser.showSaveDialog(null);
           if (result == JFileChooser.APPROVE_OPTION) {
               File selectedFile = fileChooser.getSelectedFile();
               String fileName = selectedFile.getAbsolutePath();
               if (!fileName.endsWith(".png") || !fileName.endsWith(".jpg") || !fileName.endsWith(".gif")){
                   fileName += ".png";
               }
               exportToImage(panel, fileName);
               JOptionPane.showMessageDialog(panel, "File exported to: " + fileName);

           }
       };
    }

    public void exportToImage(Component component, String outputFileName) {
        BufferedImage bufferedImage = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        try {

            Graphics2D graphics2D = bufferedImage.createGraphics();
            component.paint(graphics2D);
            graphics2D.dispose();

            ImageIO.write(bufferedImage, "png", new File(outputFileName));


        } catch (Exception e) {
            e.printStackTrace();
        }

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
