package gui;

import app.AplicacionUsuarios;

import javax.swing.*;
import java.awt.*;

public class VentanaInicioSesion extends JFrame {
    private AplicacionUsuarios app;
    private JPanel panel1,panel2,panel3,botonera;
    private JLabel bescared,nombre;
    private JTextField usuario;
    private JButton aceptarBt,cancelarBt;
    public VentanaInicioSesion(AplicacionUsuarios app) {
        this.app=app;
        this.setLayout(new GridLayout(4,1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 507, 376);

        panel1=new JPanel();
        bescared=new JLabel("Bescared tu tienda de disfraces");
        panel1.add(bescared);

        panel2=new JPanel();
        panel2.setLayout(new GridLayout(1,2));
        nombre=new JLabel("Nombre");
        usuario=new JTextField("Introduzca su nombre");
        panel2.add(nombre);
        panel2.add(usuario);

        panel3=new JPanel();

        botonera=new JPanel();
        aceptarBt=new JButton("Aceptar");
        cancelarBt=new JButton("Cancelar");
        botonera.add(aceptarBt);
        botonera.add(cancelarBt);


        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(botonera);
    }
}
