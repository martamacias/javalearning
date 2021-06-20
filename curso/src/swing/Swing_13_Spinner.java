package curso.src.swing;

import javax.swing.*;

public class Swing_13_Spinner {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaSpinner laminaS = new LaminaSpinner();
        marco.add(laminaS);
        marco.setSize(400, 300);
    }
}

class LaminaSpinner extends JPanel{
    private JSpinner spinner;

    public LaminaSpinner(){
        spinner = new JSpinner();

        add(spinner);
    }
}