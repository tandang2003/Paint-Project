package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ColorButton extends JButton {
    Color color;

    public ColorButton(Color color, int i, ActionListener action) {
        this.color = color;
        setActionCommand("" + i);
        setPreferredSize(new Dimension(25, 25));

        addActionListener(action);

        addActionListener(action);

    }

    @Override
    public void paintComponent(Graphics g) {
        setBackground(color);
        super.paintComponent(g);
    }
}
