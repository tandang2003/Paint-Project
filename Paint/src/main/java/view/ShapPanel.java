package view;

import controller.Controller;

import javax.swing.*;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapPanel extends JPanel {
//    ActionListener shapeAction;
    public static final int LINE = 1;
    public static final int CIRCLE = 2;
    public static final int REC = 3;
    public static final int TRIANGLE = 4;
    public static final int SQUARE = 5;

    public static final int BALANCER = 6;
    public static final int DIAMOND = 7;
    public static final int PEN = 8;

    static int padding = 5;
    int shapeType;

    public ShapPanel(Controller controller) {

        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBounds(0, 0, 500, 400);
        this.setBackground(Color.WHITE);

        JButton lineBtn = new JButton();
//        lineBtn.setBounds(5, 5, 40, 40);
        Image imageLine = new ImageIcon("src\\main\\java\\pictures\\line.png").getImage();
        ImageIcon btline = new ImageIcon(imageLine.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        lineBtn.setIcon(btline);
        lineBtn.setActionCommand(String.valueOf(LINE));
        lineBtn.addActionListener(controller.getShapeAction());
        add(lineBtn);

        JButton ovalBtn = new JButton();
//        ovalBtn.setBounds(5, 45, 40, 40);
        Image imageOval = new ImageIcon("src\\main\\java\\pictures\\circle.png").getImage();
        ImageIcon btOval = new ImageIcon(imageOval.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        ovalBtn.setIcon(btOval);
//        ovalBtn.setActionCommand('0');
//        ovalBtn.addActionListener(controller.getShapeAction());
        add(ovalBtn);

        JButton recBtn = new JButton();
//        recBtn.setBounds(5, 85, 40, 40);
        Image imageRec = new ImageIcon("src\\main\\java\\pictures\\rectangle.png").getImage();
        ImageIcon btRec = new ImageIcon(imageRec.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        recBtn.setIcon(btRec);
        add(recBtn);

        JButton triBtn = new JButton();
//        triBtn.setBounds(5, 125, 40, 40);
        Image imageTri = new ImageIcon("src\\main\\java\\pictures\\triangle.png").getImage();
        ImageIcon btTri = new ImageIcon(imageTri.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        triBtn.setIcon(btTri);
        add(triBtn);

        JButton squarBtn = new JButton();
//        squarBtn.setBounds(5, 165, 40, 40);
        Image imageSquar = new ImageIcon("src\\main\\java\\pictures\\square.png").getImage();
        ImageIcon btSquar = new ImageIcon(imageSquar.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        squarBtn.setIcon(btSquar);
        squarBtn.setActionCommand(String.valueOf(SQUARE));
        squarBtn.addActionListener(controller.getShapeAction());
        add(squarBtn);

        JButton diamondBtn = new JButton();
//        diamondBtn.setBounds(5, 165, 40, 40);
        Image imageDia = new ImageIcon("src\\main\\java\\pictures\\rhombus.png").getImage();
        ImageIcon btDiamond = new ImageIcon(imageDia.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        diamondBtn.setActionCommand(String.valueOf(DIAMOND));
        diamondBtn.setIcon(btDiamond);
        diamondBtn.addActionListener(controller.getShapeAction());

        add(diamondBtn);

        JButton penBtn = new JButton();
//        penBtn.setBounds(5, 205, 40, 40);
        Image imagePen = new ImageIcon("src\\main\\java\\pictures\\tie.png").getImage();
        ImageIcon btPen = new ImageIcon(imagePen.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        penBtn.setIcon(btPen);
        penBtn.setActionCommand(String.valueOf(PEN));
        penBtn.addActionListener(controller.getShapeAction());
        add(penBtn);
    }
}
