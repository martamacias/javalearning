package curso.src.swing;

import java.awt.*;
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
        //spinner = new JSpinner(); //por defecto
        // conseguir las fuentes de letra
        String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        spinner = new JSpinner(new SpinnerListModel(lista));
        spinner.setPreferredSize(new Dimension(200,20));

        add(spinner);
    }
}