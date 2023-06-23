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
import model.Point;
import model.ShapeState;
import view.*;
import model.ShapeState;
import view.ColorPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
                int shapeindex = Integer.valueOf(shapeActionCommand);
                ShapeState.setShapeIndexing(shapeindex);
                switch (shapeindex){
                    case 1:
                        System.out.println("chay line");
                        break;
                    case 5:
                        System.out.println("chay vuong");
                        break;
                    case 7:
                        System.out.println("chay dimand");
                        break;
                    case 8:
                        System.out.println("chay pen");
                        break;
                }
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
            public void mouseDragged(MouseEvent mouseEvent) {
                ShapeState.currShape.setP2(new Point(mouseEvent.getX(),mouseEvent.getY()));
                repaintDrawPaint();
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                ShapeState.currShape.setP1(new Point(e.getX(), e.getY()));
            }


            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                ShapeState.currShape.setP2(new Point(mouseEvent.getX(), mouseEvent.getY()));
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
                ShapeState.currShape.setP2(new Point(mouseEvent.getX(), mouseEvent.getY()));
                repaintDrawPaint();
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        };
    }

    public ActionListener expAction() {
       return e -> {
           JFileChooser fileChooser = new JFileChooser();
           int result = fileChooser.showSaveDialog(panel);
           if (result == JFileChooser.APPROVE_OPTION) {
               File selectedFile = fileChooser.getSelectedFile();
               String fileName = selectedFile.getAbsolutePath();
               exportToPDF(panel, fileName);
               JOptionPane.showMessageDialog(panel, "File exported to: " + fileName);

           }
       };
    }

    public  void exportToPDF(Component component, String outputFileName) {
        Document document = new Document();
        try {

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outputFileName));
            document.open();
            PdfContentByte contentByte = writer.getDirectContent();
            PdfGraphics2D graphics2D = new PdfGraphics2D(contentByte, component.getWidth(), component.getHeight());
            component.print(graphics2D);
            graphics2D.dispose();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                document.close();
            }
        }
    }
}
