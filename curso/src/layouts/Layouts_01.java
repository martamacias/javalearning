package curso.src.layouts;

import java.awt.*;
import javax.swing.*;

public class Layouts_01 {
    public static void main(String[] args) {
        MarcoLayouts marco1 = new MarcoLayouts();

        PanelLayout lamina1 = new PanelLayout();
        PanelLayout2 lamina2 = new PanelLayout2();

        // disposición de láminas
        marco1.add(lamina1, BorderLayout.NORTH);
        marco1.add(lamina2, BorderLayout.SOUTH);
    }
}

class PanelLayout extends JPanel{
    public PanelLayout(){
        // editar disposicion de elementos en la lamina (numeros = separacion)
        //setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        
    }
}

class PanelLayout2 extends JPanel{
    public PanelLayout2(){
        setLayout(new BorderLayout());

        add(new JButton("Azul"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);
    }
}