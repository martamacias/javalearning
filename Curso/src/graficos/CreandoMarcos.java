package Curso.src.graficos;

import javax.swing.*;

//import java.awt.*;

public class CreandoMarcos{
    public static void main(String[] args) {
        // crear nuevo marco
        miMarco marco1 = new miMarco();
        // hacer el marco visible
        marco1.setVisible(true);
        // cuando se cierre se acaba el programa
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // HIDE_ON_CLOSE para ocultarla y no terminar

    }
}

class miMarco extends JFrame{
    public miMarco(){
        // se puede poner marco visible y que hace al cerrar.. que está en el main
        //setSize(500,300);  // medida
        //setLocation(400,300);  // localización
        //setResizable(false);  // no cambiar tamaño con el ratón
        //setExtendedState(Frame.MAXIMIZED_BOTH); //ventana maximizada toda pantalla
        setBounds(500,300,550,250);  // localizacion + medidas
        setTitle("Mi ventana");
    }
}