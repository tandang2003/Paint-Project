package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class ShapPanel extends JPanel {
    public static final int LINE = 1;
    public static final int CIRCLE = 2;
    public static final int REC = 3;
    public static final int TRIANGLE = 4;
    public static final int SQUARE = 5;
    public static final int PEN = 6;
    static int padding = 5;
    int shapeType;

    public ShapPanel(Controller controller) {

        this.setBounds(0, 0, 500, 400);
        this.setBackground(Color.CYAN);

        ShapeButton lineBtn = new ShapeButton(1);
        lineBtn.setBounds(5, 5, 40, 40);
        add(lineBtn);

        ShapeButton ovalBtn = new ShapeButton(2);
        ovalBtn.setBounds(5, 45, 40, 40);
        add(ovalBtn);

        ShapeButton recBtn = new ShapeButton(3);
        recBtn.setBounds(5, 85, 40, 40);
        add(recBtn);

        ShapeButton triBtn = new ShapeButton(4);
        triBtn.setBounds(5, 125, 40, 40);
        add(triBtn);

        ShapeButton squarBtn = new ShapeButton(5);
        squarBtn.setBounds(5, 165, 40, 40);
        add(squarBtn);

        ShapeButton penBtn = new ShapeButton(6);
        penBtn.setBounds(5, 205, 40, 40);
        Image imagePen = new ImageIcon("..\\pictures\\pen.png").getImage();
        ImageIcon btPen = new ImageIcon(imagePen.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        penBtn.setIcon(btPen);
        add(penBtn);
    }
}
