package curso.src.swing;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Swing_03_EventosCuadroTexto {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        LaminaGeneralP lamina = new LaminaGeneralP();
        marco.add(lamina);
        marco.setSize(500, 200);
    }
}
 class LaminaGeneralP extends JPanel{
    private JPanel laminaSuperior;
    private JLabel labelUser;
    private JLabel labelPass;
    private JTextField textUser;
    private JPasswordField textPass; // con asteriscos para la contraseña
    private JButton enviar;

    public LaminaGeneralP(){
        //láminas y layouts
        setLayout(new BorderLayout());
        laminaSuperior = new JPanel();
        laminaSuperior.setLayout(new GridLayout(2,2));
        add(laminaSuperior, BorderLayout.NORTH);

        // elementos
        labelUser = new JLabel("Usuario");
        labelPass = new JLabel("Contraseña");
        textUser = new JTextField(15);
        textPass = new JPasswordField(15);
        enviar = new JButton("ENVIAR");

        CompruebaPass evento = new CompruebaPass();
        textPass.getDocument().addDocumentListener(evento);

        laminaSuperior.add(labelUser);
        laminaSuperior.add(textUser);
        laminaSuperior.add(labelPass);
        laminaSuperior.add(textPass);
        add(enviar, BorderLayout.SOUTH);
    }

    private class CompruebaPass implements DocumentListener{

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            CorrectPass();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            CorrectPass();
        }

        private void CorrectPass() {
            // de texto del cuadro contraseña
            char[] password = textPass.getPassword();

            if (password.length<8 || password.length>12){
                textPass.setBackground(Color.RED);
            } else {
                textPass.setBackground(Color.WHITE);
            }
        }
    }
 }