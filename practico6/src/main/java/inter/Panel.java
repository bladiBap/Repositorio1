package inter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel extends JPanel {

    private Arbol <ArchivoCarpeta> arbol = new Arbol<>();

    private Carpeta carpetaActual;
    private int anchoTabla;
    private int altoTabla;
    private String datos [] = new String[4];
    private JTable tabla;
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private JButton botonAtras = new JButton("<---");
    private JLabel labelDireccion = new JLabel("direc");

    public Panel(int ancho, int alto){
        carpetaActual = new Carpeta();
        arbol.insertar(carpetaActual,"1",null);
        this.altoTabla = alto;
        this.anchoTabla = ancho;
        setVisible(true);
        añadirComponentes();
        //carpetaActual = arbol.;

    }

    public void añadirComponentes (){
        setLayout(null);
        botonAtras.setBounds(2,3,70,30);

        labelDireccion.setOpaque(true);
        labelDireccion.setBounds(150,5,300,30);
        labelDireccion.setBackground(Color.RED);
        add(labelDireccion);
        add(botonAtras);


        //setLayout(null);
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Tipo");
        modeloTabla.addColumn("Tamaño");
        modeloTabla.addColumn("NombreCrip");




        tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(0, 50, anchoTabla-15,altoTabla-150);
        add(scroll);
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int fila = tabla.getSelectedRow();
                    if (modeloTabla.getValueAt(fila, 1) == "Carpeta") {

                        String s = (String) modeloTabla.getValueAt(fila,3);
                        Arbol.Nodo <ArchivoCarpeta> nodo = arbol.buscar(s);
                        carpetaActual = (Carpeta) nodo.getContenido();

                    } else {
                        System.out.println("Archivo");
                    }
                }
            }
        });
        botonAtras.addActionListener(e -> {


        });
    }

    public void insertarCarpeta (Carpeta c){

        c.setPadre(carpetaActual);
        arbol.insertar(c,"asd","1");
        datos [0] = c.getNombre();
        datos [1] = c.getTipo();
        datos [2] = String.valueOf(c.getTamaño());
        datos [3] = c.getNombreCode();

        modeloTabla.addRow(datos);

    }

    public void insertarArchivo(Archivo a){
        arbol.insertar( a,"12","1" );
        datos [0] = a.getNombre();
        datos [1] = a.getTipo();
        datos [2] = String.valueOf(a.getTamaño());
        datos [3] = a.getNombreCode();
        modeloTabla.addRow(datos);
    }

    public void repintarTabla (){}


}