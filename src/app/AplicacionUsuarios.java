package app;

import gui.VentanaInicioSesion;

public class AplicacionUsuarios {
    VentanaInicioSesion ventanaInicioSesion;
    public void ejecutar() {
        ventanaInicioSesion=new VentanaInicioSesion(this);
        ventanaInicioSesion.setVisible(true);
    }
}
