package curso.src.eventos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Eventos_02_BotonColores{
    public static void main(String[] args) {
        
        MarcoEventos miMarco = new MarcoEventos();
        miMarco.setTitle("Ejercicio botones");

        LaminaBotones2 lamina = new LaminaBotones2();
        miMarco.add(lamina);
    }
}
/**
 * la lamina ya no es la que recibe los eventos
 */
class LaminaBotones2 extends JPanel{
    
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones2(){
        
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        ColorFondo azul = new ColorFondo(Color.BLUE);
        ColorFondo amarillo = new ColorFondo(Color.YELLOW);
        ColorFondo rojo = new ColorFondo(Color.RED);

        botonAzul.addActionListener(azul);
        botonAmarillo.addActionListener(amarillo);
        botonRojo.addActionListener(rojo);
    }

    
    // construir el objeto que recibirá el evento, clase interna
    private class ColorFondo implements ActionListener{
        private Color colorDeFondo;

        public ColorFondo(Color c){
            colorDeFondo = c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFondo); // es de JPanel
        }

    }
}

