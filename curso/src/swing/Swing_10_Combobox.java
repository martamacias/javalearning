package curso.src.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// menú desplegable para cambiar el tipo de letra
public class Swing_10_Combobox {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaCombo lCombo = new LaminaCombo();

        marco.add(lCombo);
        marco.setSize(400, 250);
    }
}

class LaminaCombo extends JPanel{
    private JLabel texto;
    private JComboBox combo;
    private JPanel laminaNorte;

    public LaminaCombo(){
        setLayout(new BorderLayout());

        texto = new JLabel("Texto de prueba...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        laminaNorte = new JPanel();
        combo = new JComboBox();
        combo.setEditable(true); // que se pueda escribir

        combo.addItem("Serif");
        combo.addItem("SansSerif");
        combo.addItem("Monospaced");
        combo.addItem("Dialog");

        EventoCombo eventoCombo = new EventoCombo();
        combo.addActionListener(eventoCombo);
        laminaNorte.add(combo);

        add(texto, BorderLayout.CENTER);
        add(laminaNorte, BorderLayout.NORTH);
    }

    private class EventoCombo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String)combo.getSelectedItem(), Font.PLAIN, 18));
        }
    }
}