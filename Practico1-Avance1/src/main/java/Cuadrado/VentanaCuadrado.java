package Cuadrado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaCuadrado extends JFrame implements MouseListener {

    private PanelCuadrado panel;

    public VentanaCuadrado (){

        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        cargarComponentes();

    }

    public void cargarComponentes (){

        panel = new PanelCuadrado();

        add(panel);
        panel.addMouseListener(this);
        panel.setBackground(Color.orange);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX()+"  "+e.getY());
        Cuadrado cuaa = new Cuadrado(e.getX(),e.getY(),60);
        panel.addLista(cuaa);
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

}
