package Prac2;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

public class Arbol {

    private static final Logger logger = Logger.getRootLogger();
    private Color[] colors = {
            new Color(96, 48, 0),
            new Color(142, 71, 0),
            new Color(159, 108, 23),
            new Color(155, 163, 20),
            new Color(65, 157, 26),
            new Color(35, 86, 14)
    };
    //private double desplaParaX = 0.85 ;
    //private double desplaParay = 0.7;
    //private double desplazamiento2x = 1.15 ;
    //private double desplazamiento2y = 0.7 ;
    //private int desplazamiento = 75;

    public Arbol() {

    }

    public void dibujarArbol(int inicioColor, int ancho, int desplazamiento, int posx, int posy, int posx2, int posy2, int complegidad, Graphics g) {


        int tamaño = (int) Math.sqrt(Math.pow((posx2 - posx), 2) + Math.pow((posy2 - posy), 2));
        if (complegidad <= 0) {
            return;
        }

        BasicStroke str = new BasicStroke(ancho);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(colors[inicioColor]);
        inicioColor = inicioColor + 1;
        g2.setStroke(str);
        if (inicioColor > 5) {
            inicioColor = 5;
        }

        logger.info("posicion x1: " + posx + " posicion y1: " + posy + " ---- " + " posicion x2: " + posx2 + " posicion y2: " + posy2 + "  -----  " + " Con un tamaño de: " + tamaño+" Con una anchura de: "+ancho);
        g2.drawLine(posx, posy, posx2, posy2);

        //int finalx = (int)(posx2*desplaParaX);
        //int finaly = (int)(posy2*desplaParay);
        int finalx = posx2 - desplazamiento + 35; //35
        int finaly = posy2 - desplazamiento + 25; //25
        int nuevoDesplazamiento = desplazamiento - 10;
        int nuevaAnchura = ancho - 2;

        if (nuevaAnchura <= 2 ) {
            nuevaAnchura = 1;
        }




        dibujarArbol(inicioColor, nuevaAnchura, nuevoDesplazamiento, posx2, posy2, finalx, finaly, complegidad - 1, g);

        int finalx2 = posx2 + desplazamiento - 35; //35
        //int finalyz = posy2-desplazamiento;
        //int nuevoDesplazamiento2 = desplazamiento-15;

        //int finalxz = (int)(posx2*desplazamiento2x);
        //int finalyz = (int)(posy2*desplazamiento2y);

        dibujarArbol(inicioColor, nuevaAnchura, nuevoDesplazamiento, posx2, posy2, finalx2, finaly, complegidad - 1, g);

    }


}
