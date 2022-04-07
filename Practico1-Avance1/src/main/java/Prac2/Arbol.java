package Prac2;

import org.apache.log4j.Logger;

import java.awt.*;

public class Arbol {

    private static final Logger logger = Logger.getRootLogger();
    private double desplaParaX = 0.85 ;
    private double desplaParay = 0.7;
    private double desplazamiento2x = 1.15 ;
    private double desplazamiento2y = 0.7 ;

    public Arbol (){

    }

    public void dibujarArbol (int posx, int posy, int posx2, int posy2, int complegidad, Graphics g){

        int tamaño = (int)Math.sqrt(Math.pow((posx2-posx),2)+Math.pow((posy2-posy),2));
        if (complegidad <= 1){
            return;
        }

        BasicStroke str = new BasicStroke(10, BasicStroke.CAP_SQUARE,BasicStroke.JOIN_BEVEL);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(str);

        logger.info("posicion x1: "+posx+" posicion y1: "+posy+" posicion x2: "+posx2+" posicion y2: "+posy2+" Con un tamaño de: "+tamaño);
        g2.drawLine(posx,posy,posx2,posy2);

        int finalx = (int)(posx2*desplaParaX);
        int finaly = (int)(posy2*desplaParay);

        dibujarArbol(posx2,posy2,finalx,finaly,complegidad-1,g);

        int finalxz = (int)(posx2*desplazamiento2x);
        int finalyz = (int)(posy2*desplazamiento2y);

        dibujarArbol(posx2,posy2,finalxz,finalyz,complegidad-1,g);

    }

}
