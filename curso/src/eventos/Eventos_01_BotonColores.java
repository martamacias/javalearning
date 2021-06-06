package curso.src.eventos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Eventos_01_BotonColores{
    public static void main(String[] args) {
        
        MarcoEventos miMarco = new MarcoEventos();
        miMarco.setTitle("Ejercicio botones");

        LaminaBotones lamina = new LaminaBotones();
        miMarco.add(lamina);
    }
}

/**
 * la propia lamina es la que recibe los eventos
 */
class LaminaBotones extends JPanel implements ActionListener{
    // construir botones
    JButton botonAzul = new JButton("Azul"); // objeto fuente (que desencadena la accion)
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones(){
        // agregar botones
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        // agregar listener para la accion
        botonAzul.addActionListener(this); // objeto evento (al hacer clic), listener lámina
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }

    // qué hace el evento según origen
    public void actionPerformed(ActionEvent e){
        Object botonPulsado = e.getSource();

        if (botonPulsado == botonAzul){setBackground(Color.BLUE);}
        else if (botonPulsado == botonAmarillo){setBackground(Color.YELLOW);}
        else if (botonPulsado == botonRojo){setBackground(Color.RED);}
    }
}