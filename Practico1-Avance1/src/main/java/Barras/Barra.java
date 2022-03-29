package Barras;

import java.awt.*;

public class Barra {

    private int posX;
    private int tamaño;
    private Color color = Color.BLUE;

    public Barra(int posX, int tamaño) {
        this.posX = posX;
        this.tamaño = tamaño;
    }
    public Barra() {

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void dibujar (Graphics g){

        g.fillRect(posX+10,tamaño-200,10,tamaño);

    }
}
