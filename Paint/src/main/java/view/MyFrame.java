package view;

import javax.swing.JFrame;

import controller.Controller;




public class MyFrame extends JFrame {
    private MyPanel panel;

    public MyFrame(Controller controller) {
        panel = new MyPanel(controller);
        add(panel);
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void repaintDrawPaint() {
        panel.repaintDrawPaint();

    }
}
