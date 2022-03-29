package Ventana;

import Barras.Barra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private Barra barra;
    private Panel panel;

    public Ventana(){

        setSize(1000,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.cargarElementos();
        setTitle("Practico1");
        setVisible(true);
    }

    public void cargarElementos (){
        this.getContentPane().setBackground(Color.cyan);

        panel = new Panel();
        this.getContentPane().add(panel);
        panel.setBackground(Color.orange);
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Nuevo");
        JMenu menu2 = new JMenu("Menu2");
        bar.add(menu);
        bar.add(menu2);
        JMenuItem item = new JMenuItem("Nueva Barra");
        JMenuItem item2 = new JMenuItem("Nueva 1");
        JMenuItem item3 = new JMenuItem("Nueva 2");
        menu.add(item);
        menu.add(item2);
        menu.add(item3);
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubVentana v = new SubVentana();
            }
        });
        setJMenuBar(bar);
        //this.pack();
    }
}
