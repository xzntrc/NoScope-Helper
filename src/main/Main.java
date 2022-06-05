package main;

import javax.swing.*;
import java.awt.*;

class ShapeDrawing extends JComponent{
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.GREEN);
        int size = 10;
        int x = 50;
        int y = 50;
        g.drawLine(x, y - size, x, y + size);
        g.drawLine(x + size, y, x - size, y);
    }
}
public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NoScope Helper");
        // Transparent
        frame.setUndecorated(true);
        frame.setBackground(new Color(1.0f,1.0f,1.0f,0f));

        // Crosshair overlay
        frame.getContentPane().add(new ShapeDrawing ());

        // Force on top and stop the window from being moved.
        frame.setAlwaysOnTop(true);
        frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", false);

        frame.setPreferredSize(new Dimension(100, 100));
        frame.pack();

        // Moving to the middle
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }
}