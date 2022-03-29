package Ventana;

import Barras.Barra;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Barra barra;

    public Panel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100,100,30,30);
        g.setColor(Color.cyan);
        //barra.dibujar(g);
    }


}
