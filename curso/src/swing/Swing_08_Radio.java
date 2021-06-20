package curso.src.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_08_Radio {
    public static void main(String[] args) {
        MarcoSwing marco1 = new MarcoSwing();
        LaminaRadio lamina1 = new LaminaRadio();
        marco1.add(lamina1);

        marco1.setSize(400,200);
    }
}
class LaminaRadio extends JPanel{
    private JLabel texto;
    private JRadioButton boton1, boton2, boton3, boton4;
    private ButtonGroup grupo1;
    private JPanel laminaRadio;

    public LaminaRadio(){
        setLayout(new BorderLayout());

        texto = new JLabel("Texto de prueba...");
        grupo1 = new ButtonGroup();
        boton1 = new JRadioButton("Pequeño", false);
        boton2 = new JRadioButton("Mediano", true);
        boton3= new JRadioButton("Grande", false);
        boton4 = new JRadioButton("Muy grande", false);
        laminaRadio = new JPanel();

        ModificaTexto accionModifica = new ModificaTexto();
        boton1.addActionListener(accionModifica);
        boton2.addActionListener(accionModifica);
        boton3.addActionListener(accionModifica);
        boton4.addActionListener(accionModifica);

        grupo1.add(boton1);
        grupo1.add(boton2);
        grupo1.add(boton3);
        grupo1.add(boton4);

        laminaRadio.add(boton1);
        laminaRadio.add(boton2);
        laminaRadio.add(boton3);
        laminaRadio.add(boton4);

        add(texto, BorderLayout.CENTER);
        add(laminaRadio, BorderLayout.SOUTH);
    }

    private class ModificaTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==boton1) {
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            } else if (e.getSource()==boton2) {
                texto.setFont(new Font("Serif", Font.PLAIN, 12));
            } else if (e.getSource()==boton3) {
                texto.setFont(new Font("Serif", Font.PLAIN, 18));
            } else if (e.getSource()==boton4) {
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }
        }
    }
}