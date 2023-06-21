package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ColorPanel extends JPanel {
    ActionListener colorAction;
    private Color[] colors = {
            Color.BLUE, Color.CYAN, Color.RED,
            Color.getHSBColor(189, 183, 107),//mau cam dat
            Color.MAGENTA, Color.PINK,
            Color.getHSBColor(219, 112, 147),//hong nhat
            Color.getHSBColor(221, 160, 221),//socola
            Color.getHSBColor(255, 250, 205),//nau bun
            Color.getHSBColor(255, 218, 185),//mau be
            Color.getHSBColor(72, 61, 139),//hong cam
            Color.getHSBColor(173, 255, 47),//nude
            Color.getHSBColor(240, 128, 128),//da cam
            Color.getHSBColor(85, 107, 47),//vang chanh nhat
            Color.getHSBColor(100, 149, 237),//cam dam
            Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.getHSBColor(255, 255, 224),//la non
            Color.getHSBColor(250, 250, 210),//la ma
            Color.getHSBColor(245, 245, 220),//xanh la nga xanh duong
            Color.getHSBColor(230, 230, 250),//xanh la
            Color.getHSBColor(255, 228, 181),//xanh bo doi
            Color.getHSBColor(255, 235, 205),//nau
            Color.BLACK, Color.getHSBColor(144, 238, 144),//nau dat
            Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.WHITE
    };

    public ColorPanel(Controller controller) {
        if(controller != null){
            this.colorAction = controller.getColorAction();
            for (int i = 0; i < 30; i++){
                add(new ColorButton(colors[i],i, colorAction));
            }

        }

        setLayout(new GridLayout(2, 15));


    }
}
