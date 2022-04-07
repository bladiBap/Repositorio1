package Prac2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {

    //Arbol arbol = new Arbol();

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
        arbol.dibujarArbol(500,500,500,300,8,g);
        //g2.drawLine(100,100,50,50);
        //g2.drawLine(50,50,300,50);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

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

    public void dibujarTierra(Graphics g){
        g.setColor(new Color(0, 254, 0));
        g.fillRect(0,200,1000,400);
    }

    public void dibujarCielo(Graphics g){
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0,0,1000,200);
    }
    public void dibujarSol(Graphics g){
        g.setColor(new Color(250, 250, 0));
        g.fillOval(800,120,50,50);
    }
}
