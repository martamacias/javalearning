package curso.src.swing;

import javax.swing.*;

public class Swing_07_SintaxisRadio {
    public static void main(String[] args) {
        MarcoSwing marco1 = new MarcoSwing();
        LaminaRadioSint lamina1 = new LaminaRadioSint();

        marco1.add(lamina1);
        marco1.setSize(500, 300);
    }
}

class LaminaRadioSint extends JPanel{
    private ButtonGroup grupo1;
    private ButtonGroup grupo2;
    private JRadioButton boton1;
    private JRadioButton boton2;
    private JRadioButton boton3;
    private JRadioButton boton4;
    private JRadioButton boton5;

    public LaminaRadioSint(){
        grupo1 = new ButtonGroup();
        grupo2 = new ButtonGroup();
        boton1 = new JRadioButton("Azul", false);
        boton2 = new JRadioButton("Rojo", true);
        boton3 = new JRadioButton("Verde", false);
        boton4 = new JRadioButton("Masculino", false);
        boton5 = new JRadioButton("Femenino", false);

        grupo1.add(boton1);
        grupo1.add(boton2);
        grupo1.add(boton3);
        grupo2.add(boton4);
        grupo2.add(boton5);

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
    }
}