package curso.src.eventos;

import java.awt.event.*;
import java.awt.*;

public class Eventos_04_VentanaEstado {
    public static void main(String[] args) {
        MarcoEventos marco = new MarcoEventos();
        marco.setTitle("Ventana 1");

        CambiaEstado nuevoEstado = new CambiaEstado();
        marco.addWindowStateListener(nuevoEstado);
    }
}

class CambiaEstado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {
        //System.out.println("La ventana ha cambiado de estado");
        //System.out.println(e.getNewState());

        /* el getNewState() devuelve integers:
        maximizada = 6
        estado inicial = 0
        minimizada = 1 */

        // con numeros
        //if (e.getNewState()==6) System.out.println("La ventana ha sido maximizada");
        //if (e.getNewState()==1) System.out.println("La ventana ha sido minimizada");
        //if (e.getNewState()==0) System.out.println("La ventana está normal");

        // con Frame.estado*
        if (e.getNewState()==Frame.MAXIMIZED_BOTH) System.out.println("La ventana ha sido maximizada");
        if (e.getNewState()==Frame.ICONIFIED) System.out.println("La ventana ha sido minimizada");
        if (e.getNewState()==Frame.NORMAL) System.out.println("La ventana está normal");
    }
}