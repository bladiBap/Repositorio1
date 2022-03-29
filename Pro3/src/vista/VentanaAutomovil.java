package vista;

import proIII.MVC.Automovil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAutomovil extends JFrame {

    private Automovil modelo;
    private PanelAutomovil panel;

    public VentanaAutomovil(){
        init();
    }

    public void  init (){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        modelo = new Automovil("Toyota",Color.BLUE,50);
        panel = new PanelAutomovil(modelo);

        this.getContentPane().add(panel,BorderLayout.CENTER);

        //menu
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("AUTOMOVIL");
        bar.add(menu);
        JMenuItem item = new JMenuItem("Derecha");
        JMenuItem item2 = new JMenuItem("Izquierda");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAutomovilDerecha();
            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAutomovilIzquierda();
            }
        });
        menu.add(item);
        menu.add(item2);
        this.setJMenuBar(bar);

        this.pack();
    }

    private void menuAutomovilDerecha() {
        modelo.moverDerecha();
        repaint();
    }

    private void menuAutomovilIzquierda() {
        modelo.moverIzquierda();
        repaint();
    }

}
