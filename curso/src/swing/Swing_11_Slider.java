package curso.src.swing;

import javax.swing.*;
import java.awt.*;

public class Swing_11_Slider {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaSlider lamina = new LaminaSlider();

        marco.add(lamina);
        marco.setSize(400, 300);
    }
}

class LaminaSlider extends JPanel{
    private JSlider slider;

    public LaminaSlider(){
        //min, max, posición
        slider = new JSlider(0, 100, 50);
        //slider.setOrientation(SwingConstants.VERTICAL); //orientación vertical

        // marcas mayores y menores
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        //letra rotulos
        slider.setFont(new Font("Serif", Font.ITALIC, 12));
        // rotulos con numeros
        slider.setPaintLabels(true);
        // slider en marcas
        slider.setSnapToTicks(true);

        add(slider);
    }
}
