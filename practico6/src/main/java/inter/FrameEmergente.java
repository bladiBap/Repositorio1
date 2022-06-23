package inter;

import javax.swing.*;

public class FrameEmergente extends JFrame {
    private String nombreCarpeta  = "";
    private JButton botonOk = new JButton("Crear");
    private JLabel label = new JLabel("Ingrese el nombre");
    private JTextField campoTxT = new JTextField();

    public FrameEmergente(){
        setSize(500,200);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        añadirComponentes();

    }

    public void añadirComponentes (){
        label.setBounds(100,50,140,30);
        campoTxT.setBounds(220,50,230,30);
        botonOk.setBounds(200,100,100,30);
        botonOk.addActionListener(e ->{

            String name = campoTxT.getText().trim();
            if (name.equals("")){
                JOptionPane.showMessageDialog(null,"Ingrese un nombre valido");
                campoTxT.setText("");
            }else{
                this.nombreCarpeta = name;
                this.dispose();
            }
        } );
        add(label);
        add(campoTxT);
        add(botonOk);
    }

}
