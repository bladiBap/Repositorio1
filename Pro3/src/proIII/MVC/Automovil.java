package proIII.MVC;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Automovil {

    private String marca;
    private Color color;
    private int tamaño;
    private int x;
    private int y;
    private PropertyChangeSupport cambios;

    public Automovil(String marca, Color color, int tamaño) {
        this.marca = marca;
        this.color = color;
        this.tamaño = tamaño;
        this.x = 100;
        this.y = 100;
        cambios = new PropertyChangeSupport(this);
    }

    public void  addObserver (PropertyChangeListener listener){
        cambios.addPropertyChangeListener(listener);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void dibujar (Graphics g){
        g.setColor(color);
        // rectangulo principal y secundario
        g.fillRect(x,y+tamaño,4*tamaño,2*tamaño);
        g.fillRect(x+tamaño,y,2*tamaño,tamaño);
        // ruedas
        g.fillOval(x+(int)(0.5*(double)tamaño),y+(int)(2.5*(double)tamaño),tamaño,tamaño );
        g.fillOval(x+(int)(2.5*(double)tamaño),y+(int)(2.5*(double)tamaño),tamaño,tamaño );
    }

    public void moverDerecha (){
        int oldx = x;
        x+=5;
        System.out.println("asd");
        cambios.firePropertyChange("Posicion",oldx,x);
    }

    public void moverIzquierda (){
        int oldx = x;
        x-=5;
        cambios.firePropertyChange("Posicion", oldx,x);
    }
}
