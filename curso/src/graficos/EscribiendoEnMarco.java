package curso.src.graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoTexto marco = new MarcoTexto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto(){
        setVisible(true);
        setTitle("Marco Escrito");
        setSize(600, 450);
        setLocation(400, 200);
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Aprendiendo Swing", 100, 100);
    }
}