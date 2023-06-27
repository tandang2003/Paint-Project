package controller;


import model.*;
import model.Point;
import view.ColorPanel;
import model.ShapeState;
import view.ColorPanel;
import view.MyFrame;

import java.awt.*;
import java.awt.event.*;

import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
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
import java.io.FileOutputStream;


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


    //shape actionlistener
    public ActionListener getShapeAction(){
        return new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("chay shape");
                String shapeActionCommand = e.getActionCommand();
                System.out.println(shapeActionCommand);
                int shapeindex = Integer.valueOf(shapeActionCommand);

                ShapeState.setShapeIndexing(shapeindex);
//                switch (shapeindex){
//                    case 1:
//                        System.out.println("chay line");
//                        break;
//                    case 5:
//                        System.out.println("chay vuong");
//                        break;
//                    case 7:
//                        System.out.println("chay dimand");
//                        break;
//                    case 8:
//                        System.out.println("chay pen");
//                        break;
//                }
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
           int result = fileChooser.showSaveDialog(panel);
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
        BufferedImage img = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        try {
            Graphics2D graphics2D = img.createGraphics();
            component.print(graphics2D);
            graphics2D.dispose();

            ImageIO.write(img, "png", new File(outputFileName));
            ImageIO.write(img, "ipg", new File(outputFileName));
            ImageIO.write(img, "gif", new File(outputFileName));
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
