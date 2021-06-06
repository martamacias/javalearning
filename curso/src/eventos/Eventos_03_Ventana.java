package curso.src.eventos;

import java.awt.event.*;

import javax.swing.JFrame;

public class Eventos_03_Ventana {
    public static void main(String[] args) {

        MarcoEventos marco1 = new MarcoEventos();
        marco1.setTitle("Eventos de ventana 1");

        MarcoEventos marco2 = new MarcoEventos();
        marco2.setTitle("Eventos de ventana 2");
        marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // si se cierra no se termina el programa
        marco2.setLocation(500, 50);

        M_Ventana oyeneteVentana = new M_Ventana(); // se puede instanciar dentro
        marco1.addWindowListener(oyeneteVentana);
        marco2.addWindowListener(oyeneteVentana);
    }
}

class M_Ventana extends WindowAdapter{
    // no se deben implementar todos los métodos
    @Override
    public void windowIconified(WindowEvent arg0) {
        System.out.println("Ventana minimizada");
    }
}


/*class M_Ventana implements WindowListener{
    // se implementan todos los métodos, no hace falta meter más código

    @Override
    public void windowActivated(WindowEvent arg0) {
        System.out.println("Ventana activa");
    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        System.out.println("La ventana ha sido cerrada");
    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
        System.out.println("Ventana inactiva");
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowOpened(WindowEvent arg0) {
        System.out.println("Ventana abierta");
    }

}*/