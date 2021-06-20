package curso.src.swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


public class Swing_12_Slider {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaSLider2 lamina = new LaminaSLider2();
        marco.add(lamina);
        marco.setSize(600, 300);
    }
}

class LaminaSLider2 extends JPanel{
    private JLabel rotulo;
    private JSlider control;
    private JPanel lamina2;

    public LaminaSLider2(){
        setLayout(new BorderLayout());

        rotulo = new JLabel("Texto de ejemplo...");
        control = new JSlider(8, 50, 12); //tamaño letras
        lamina2 = new JPanel();

        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        EventoSlider evento = new EventoSlider();
        control.addChangeListener(evento);

        lamina2.add(control);
        add(lamina2, BorderLayout.NORTH);
        add(rotulo, BorderLayout.CENTER);
    }

    private class EventoSlider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
        }

    }
}