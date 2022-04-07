package Prac2;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    public Panel() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100,100,50,50);

    }
}
