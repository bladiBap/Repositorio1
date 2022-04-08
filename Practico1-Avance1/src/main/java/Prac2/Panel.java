package Prac2;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private int anchoCielo = 200;
    private static final Logger logger = Logger.getRootLogger();

    public Panel() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Arbol arbol = new Arbol();
        dibujarCielo(g);
        dibujarTierra(g);
        dibujarSol(g);
        g.setColor(Color.BLACK);

        logger.info("Arbol Central");
        arbol.dibujarArbol(0, 15, 100, 500, 550, 500, 350, 9, g);

        logger.info("Arbol Izquierdo");
        arbol.dibujarArbol(0, 8, 55, 200, 200, 200, 150, 4, g);

        logger.info("Arbol Derecho");
        arbol.dibujarArbol(0, 10, 75, 850, 350, 850, 250, 5, g);

        //arbol.dibujarArbol(10,75,500,500,500,300,5,g);
        //g2.drawLine(100,100,50,50);
        //g2.drawLine(50,50,300,50);

    }


    public void dibujarTierra(Graphics g) {
        g.setColor(new Color(0, 254, 0));
        g.fillRect(0, 200, 1000, 400);
    }

    public void dibujarCielo(Graphics g) {
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0, 0, 1000, anchoCielo);
    }

    public void dibujarSol(Graphics g) {
        g.setColor(new Color(250, 250, 0));
        g.fillOval(800, 120, 50, 50);
    }

    public int getAnchoCielo() {
        return anchoCielo;
    }


}
