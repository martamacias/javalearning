package curso.src.swing;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Swing_02_EventosCuadrosTexto {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaEventoCT lamina1 = new LaminaEventoCT();
        marco.add(lamina1);
        marco.setSize(500, 300);
    }
}
class LaminaEventoCT extends JPanel{
    private JTextField campo1;
    private Document doc1;
    private EscuchaTexto evento1;

    public LaminaEventoCT(){
        campo1 = new JTextField(20);
        evento1 = new EscuchaTexto();

        doc1 = campo1.getDocument();
        doc1.addDocumentListener(evento1);

        add(campo1);
    }

    // ver cambios en texto
    private class EscuchaTexto implements DocumentListener{

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

    }
}