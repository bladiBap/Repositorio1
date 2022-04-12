package Cuadrado;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelCuadrado extends JPanel {

    private ArrayList<Cuadrado> listaCuadrado = new ArrayList<>();

    public PanelCuadrado (){

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("xd");
        //listaCuadrado.dibujar(g);
        for (int i = 0; i < listaCuadrado.size(); i++) {
            System.out.println("asd");
            g.setColor(Color.MAGENTA);
            listaCuadrado.get(i).dibujar(g);
            System.out.println("jajajaj");
        }


    }

    public void addLista (Cuadrado cua){
        listaCuadrado.add(cua);
        repaint();
    }
}
