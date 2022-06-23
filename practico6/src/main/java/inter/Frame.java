package inter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Frame extends JFrame {

    private String tablaa [] = {"a","s","d"};
    private JTable tabla;
    private DefaultTableModel modeloTabla = new DefaultTableModel();

    public Frame (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);
        cargarComponentes();

    }

    public void cargarComponentes (){

        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Edad");

        for (int i = 0; i < 60; i++) {
            modeloTabla.addRow(tablaa);
        }
        tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(0, 0, 10, 60);
        add(scroll);

        JMenuBar bar = new JMenuBar();
        this.setJMenuBar(bar);
        JMenu menu = new JMenu("Opciones");
        bar.add(menu);

        JMenuItem itemArchivo = new JMenuItem("Cargar Archivo");
        JMenuItem itemCarpeta = new JMenuItem("Crear Carpeta");
        //JMenuItem itemSubirArchivo = new JMenuItem("Subir Archivo");

        itemArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //menuArchivo_cargarTXT();
                System.out.println("Entroo");
                menuArchivo_cargarTXT();
            }
        });
        itemCarpeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //menuArchivo_cargarTXT();
                System.out.println("Entroo");
                FrameEmergente panel = new FrameEmergente();
            }
        });

        menu.add(itemArchivo);
        menu.add(itemCarpeta);
        //menu.add(itemSubirArchivo);
        this.pack();
    }

    protected void menuArchivo_cargarTXT() {
        JFileChooser fileChooser = new JFileChooser();
        int respuesta = fileChooser.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File Archivo = new File(fileChooser.getSelectedFile().getPath());
            System.out.println(Archivo.getPath()+"");
        }
    }

}
