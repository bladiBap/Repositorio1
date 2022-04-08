package Prac2;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame implements MouseListener {

    private static final Logger logger = Logger.getRootLogger();
    private Panel panel;

    public Ventana() {
        setTitle("Practico 2 Fractales");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        cargarElementos();
    }

    private void cargarElementos() {

        panel = new Panel();
        panel.addMouseListener(this);
        this.add(panel);
        //panel.setBackground(Color.orange);


    }

    @Override
    public void mouseClicked(MouseEvent e) {

        verificacion(e.getY(), e.getX());

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void verificacion(int y, int x) {

        if (y <= panel.getAnchoCielo()) {
            JOptionPane.showMessageDialog(null, "No se puede crear un arbol en el cielo");
            return;
        }
        logger.info("La Posicision en X: " + x + " y Posicion en Y: " + y + " es valida");
    }


}
