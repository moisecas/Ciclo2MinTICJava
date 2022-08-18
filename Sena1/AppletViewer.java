package Sena1;

import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;

public class AppletViewer implements AdjustmentListener {

    private JFrame frame = new JFrame();
    private Panel panel;
    private Scrollbar scrollbarColor1, scrollbarColor2, scrollbarColor3;
    private Label labelValorDeslizador1, labelValorDeslizador2, labelValorDeslizador3;

    AppletViewer(){
        frame.setTitle("Applet Viewer");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        panel = new Panel();
        panel.setSize(400, 400);
        panel.setBackground(Color.white);
        frame.add(panel);
        scrollbarColor1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        scrollbarColor1.setSize(200, 20);
        scrollbarColor1.setLocation(10, 10);
        scrollbarColor1.addAdjustmentListener(this);
        frame.add(scrollbarColor1);
        labelValorDeslizador1 = new Label("0");
        labelValorDeslizador1.setSize(100, 20);
        labelValorDeslizador1.setLocation(220, 10);
        frame.add(labelValorDeslizador1);
        scrollbarColor2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        scrollbarColor2.setSize(200, 20);
        scrollbarColor2.setLocation(10, 40);
        scrollbarColor2.addAdjustmentListener(this);
        frame.add(scrollbarColor2);
        labelValorDeslizador2 = new Label("0");
        labelValorDeslizador2.setSize(100, 20);
        labelValorDeslizador2.setLocation(220, 40);
        frame.add(labelValorDeslizador2);
        scrollbarColor3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 255);
        scrollbarColor3.setSize(200, 20);
        scrollbarColor3.setLocation(10, 70);
        scrollbarColor3.addAdjustmentListener(this);
        frame.add(scrollbarColor3);
        labelValorDeslizador3 = new Label("0");
        labelValorDeslizador3.setSize(100, 20); 
        labelValorDeslizador3.setLocation(220, 70);
        frame.add(labelValorDeslizador3);

    }
    public static void main(String[] args) {
        AppletViewer appletViewer = new AppletViewer();
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        if (e.getSource() == scrollbarColor1) {
            labelValorDeslizador1.setText(String.valueOf(scrollbarColor1.getValue()));
        }
        if (e.getSource() == scrollbarColor2) {
            labelValorDeslizador2.setText(String.valueOf(scrollbarColor2.getValue()));
        }
        if (e.getSource() == scrollbarColor3) {
            labelValorDeslizador3.setText(String.valueOf(scrollbarColor3.getValue()));
        }
        panel.repaint();
    }

}
