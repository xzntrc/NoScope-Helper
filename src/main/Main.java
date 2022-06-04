package main;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NoScope Helper");
        // Transparent
        frame.setUndecorated(true);
        frame.setBackground(new Color(1.0f,1.0f,1.0f,0f));

        // Crosshair overlay
        frame.add(new JLabel(new ImageIcon("res/crosshair.png")));

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