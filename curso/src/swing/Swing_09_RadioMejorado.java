package curso.src.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_09_RadioMejorado {
    public static void main(String[] args) {
        MarcoSwing mSwing = new MarcoSwing();
        LaminaRadio2 lRadio2 = new LaminaRadio2();
        mSwing.add(lRadio2);
        mSwing.setSize(400, 200);
    }
}

class LaminaRadio2 extends JPanel{
    private JLabel texto;
    private ButtonGroup grupo1;
    private JPanel laminaBotones;

    public LaminaRadio2(){
        setLayout(new BorderLayout());

        texto = new JLabel("Texto de prueba...");
        grupo1 = new ButtonGroup();
        laminaBotones = new JPanel();

        texto.setFont(new Font("Serif", Font.PLAIN, 12));

        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 24);

        add(texto, BorderLayout.CENTER);
        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void colocarBotones(String nombre, boolean seleccionado, final int size){
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        grupo1.add(boton);
        laminaBotones.add(boton);

        ActionListener evento = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, size));
            }

        };
        boton.addActionListener(evento);
    }
}