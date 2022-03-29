package Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubVentana extends JFrame implements ActionListener {

    private JLabel posicion = new JLabel("Poscision");
    private JLabel numero = new JLabel("Numero");
    private JTextField rellenarPosicion = new JTextField();
    private JTextField rellenarNumero = new JTextField();
    private  JButton botonOk = new JButton("OK");

    public SubVentana(){

        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Practico1");
        setVisible(true);
        cargarElementos();


    }
    public void cargarElementos () {

        setLayout(null);
        posicion.setBounds(100,100,100,30);
        rellenarPosicion.setBounds(100,150,100,30);
        numero.setBounds(100,200,100,30);
        rellenarNumero.setBounds(100,250,100,30);
        botonOk.setBounds(100,300,100,30);

        add(posicion);
        add(rellenarPosicion);
        add(numero);
        add(rellenarNumero);
        add(botonOk);
        botonOk.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonOk) {

            this.dispose();
            System.out.println("asdasd");
        }
    }
}
