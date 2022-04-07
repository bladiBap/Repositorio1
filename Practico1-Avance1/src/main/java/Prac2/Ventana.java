package Prac2;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private Panel panel;

    public Ventana (){
        setTitle("Practico 2 Fractales");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,600);
        setLocationRelativeTo(null);
        setVisible(true);
        cargarElementos();
    }

    private void cargarElementos() {

        panel = new Panel();
        this.add(panel);
        panel.setBackground(Color.orange);



    }


}
