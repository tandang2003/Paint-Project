//package view;
//
//import com.itextpdf.awt.PdfGraphics2D;
//import com.itextpdf.text.pdf.PdfContentByte;
//import com.itextpdf.text.pdf.PdfWriter;
//
//import com.itextpdf.text.*;
//import controller.Controller;
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.FileOutputStream;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileOutputStream;
//
//public class ExportButtonExample {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Export Button Example");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            Controller controller = new Controller();
//            JPanel panel = new MyPanel(controller);
//
//            JButton exportButton = new JButton("Export");
//            exportButton.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JFileChooser fileChooser = new JFileChooser();
//                    int result = fileChooser.showSaveDialog(panel);
//                    if (result == JFileChooser.APPROVE_OPTION) {
//                        File selectedFile = fileChooser.getSelectedFile();
//                        String fileName = selectedFile.getAbsolutePath();
//                        exportToPDF(panel, fileName);
//                        JOptionPane.showMessageDialog(panel, "File exported to: " + fileName);
//                    }
//                }
//            });
//
//            panel.add(exportButton);
//
//            frame.getContentPane().add(panel);
//            frame.pack();
//            frame.setVisible(true);
//        });
//    }
//
//    public static void exportToPDF(Component component, String outputFileName) {
//        Document document = new Document();
//        try {
//
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outputFileName));
//            document.open();
//            PdfContentByte contentByte = writer.getDirectContent();
//            PdfGraphics2D graphics2D = new PdfGraphics2D(contentByte, component.getWidth(), component.getHeight());
//            component.print(graphics2D);
//            graphics2D.dispose();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (document != null) {
//                document.close();
//            }
//        }
//        }
//    }
//
