package Cuadrado;

import java.awt.*;

public class Cuadrado {



    private int posx;
    private int posy;
    private int lado;

    public Cuadrado(int posx, int posy, int lado) {
        this.posx = posx;
        this.posy = posy;
        this.lado = lado;
    }

    public void dibujar (Graphics g){
        g.setColor(Color.MAGENTA);
        g.fillRect( posx,posy, lado, lado);
    }


}
