package curso.src.swing;

import javax.swing.*;
import java.awt.event.*;

//pasar area de texto a consola
public class Swing_04_AreaTexto {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaArea laminaA = new LaminaArea();
        marco.add(laminaA);
        marco.setSize(500, 300);
    }
}

class LaminaArea extends JPanel{
    //declarar
    private JTextArea textArea;
    private JScrollPane laminaScroll;
    private JButton boton;
    private GestionaArea gestionaArea;

    public LaminaArea(){
        // iniciar
        textArea = new JTextArea(8,20); //filas, columnas min.
        laminaScroll = new JScrollPane(textArea); //no se alarga, hace scroll con barra
        boton = new JButton("Dale");

        //configurar
        textArea.setLineWrap(true); //enter automático horizontal, no scroll
        gestionaArea = new GestionaArea();
        boton.addActionListener(gestionaArea);

        //añadir
        add(laminaScroll);
        add(boton);
    }

    //accion para boton
    private class GestionaArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent arg0) {
            System.out.println(textArea.getText());
        }

    }
}