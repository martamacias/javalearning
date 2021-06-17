package curso.src.swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// manipular texto con checkbox
public class Swing_06_CheckBox {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaBox lamina = new LaminaBox();
        marco.add(lamina);

        marco.setSize(400, 100);
    }
}
class LaminaBox extends JPanel{
    private JPanel laminaTexto, laminaChecks;
    private JLabel texto;
    private JCheckBox check1, check2;
    private Font letra;

    // crear mas de una lamina para que aparezca mejor centrado
    public LaminaBox(){
        setLayout(new BorderLayout());

        laminaTexto = new JPanel();
        laminaChecks = new JPanel();
        letra = new Font("Serif", Font.PLAIN, 16);
        texto = new JLabel("Sed ut perspiciatis unde omnis iste...");
        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");
        texto.setFont(letra);

        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());

        laminaTexto.add(texto);
        laminaChecks.add(check1);
        laminaChecks.add(check2);

        add(laminaTexto, BorderLayout.NORTH);
        add(laminaChecks, BorderLayout.SOUTH);
    }
    private class ManejaChecks implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0) {
            int tipo = 0;

            if (check1.isSelected()) tipo += Font.BOLD; //bold = 1
            if (check2.isSelected()) tipo += Font.ITALIC; //bold = 2

            texto.setFont(new Font("Serif", tipo, 16));
        }
    }
}