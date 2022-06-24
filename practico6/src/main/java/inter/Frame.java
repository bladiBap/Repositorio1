package inter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Frame extends JFrame {
    private Panel panelT;



    public Frame (){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);
        cargarComponentes();

    }

    public void cargarComponentes (){
        setPreferredSize(this.getSize());

        JMenuBar bar = new JMenuBar();
        this.setJMenuBar(bar);
        JMenu menu = new JMenu("Opciones");
        bar.add(menu);
        JMenuItem itemArchivo = new JMenuItem("Cargar Archivo");
        JMenuItem itemCarpeta = new JMenuItem("Crear Carpeta");

        itemArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Entroo");
                menuArchivo_cargarTXT();
            }
        });
        itemCarpeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Entroo");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la carpeta");
                // Logger System.out.println("El nombre de la capeta es "+nombre);
                Carpeta nuevaCarpeta = new Carpeta();
                nuevaCarpeta.setNombre(nombre);
                nuevaCarpeta.setTamaño(100);
                nuevaCarpeta.codificarNombre();
                nuevaCarpeta.setTipo("Carpeta");
                panelT.insertarCarpeta(nuevaCarpeta);
            }
        });

        menu.add(itemArchivo);
        menu.add(itemCarpeta);


        panelT = new Panel(this.getWidth(),this.getHeight());
        this.getContentPane().add(panelT);
        this.pack();



    }

    protected void menuArchivo_cargarTXT() {
        JFileChooser fileChooser = new JFileChooser();
        int respuesta = fileChooser.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File Archivo = new File(fileChooser.getSelectedFile().getPath());
            Archivo v = new Archivo();
            v.tipo(encontrarExtension(Archivo.getName()));
            v.setNombre(encontrarNombre(Archivo.getName()));
            v.setTamaño(Archivo.length());
            v.codificarNombre();
            panelT.insertarArchivo(v);
            //System.out.println(encontrarExtension(Archivo.getName())+"");
            //System.out.println(encontrarNombre(Archivo.getName())+"");
        }
    }

    public String encontrarExtension (String ex){
        for (int i = 0 ; i<ex.length();i++){
            String letra = ex.substring(i,i+1);
            if (letra.equals(".")){
                String nombre = ex.substring(i+1,ex.length()+1-1);
                return nombre;
            }
        }
        return "no se encontro";
    }
    public String encontrarNombre (String ex){
        for (int i = 0 ; i<ex.length();i++){
            String letra = ex.substring(i,i+1);
            if (letra.equals(".")){
                String nombre = ex.substring(0,i);
                return nombre;
            }
        }

        return "no se encontro";
    }

}
