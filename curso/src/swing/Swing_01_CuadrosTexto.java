package curso.src.swing;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/** Funciones
 * label email
 * texto en JTextField
 * boton que captura el texo
 * verificar email
 * label si es correcto o no
 */

public class Swing_01_CuadrosTexto {
    public static void main(String[] args) {
        MarcoSwing marco1 = new MarcoSwing();
        LaminaTexto lamina = new LaminaTexto();
        marco1.add(lamina);
        marco1.setSize(500, 200);
    }
}

class LaminaTexto extends JPanel{
    // especificar columnas para escribir, texto...
    private JTextField campo1;
    // boton que capturará el texto
    private JButton boton;
    // etiqueta de texto
    private JLabel etiqueta;
    private String email;
    private JLabel resultado;
    // separar espacios, lamina donde va la info
    private JPanel info;

    public LaminaTexto(){
        setLayout(new BorderLayout());

        // iniciar lamina
        info = new JPanel(); 
        info.setLayout(new FlowLayout());

        // iniciar elementos
        boton = new JButton("Verificar");
        etiqueta = new JLabel("Email:");
        campo1 = new JTextField(20);
        resultado = new JLabel("", JLabel.CENTER);

        // añadir elementos
        info.add(etiqueta);
        info.add(campo1);
        add(resultado, BorderLayout.CENTER);

        DameTexto darTexto = new DameTexto();
        boton.addActionListener(darTexto);
        info.add(boton);

        //añadir lámina de info
        add(info, BorderLayout.NORTH);
    }

    private class DameTexto extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            email = campo1.getText().trim();
            ComprobarEmail(email);
        }

        private void ComprobarEmail(String email) {
            int correcto = 0;

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@'){
                    correcto ++;
                }
            }
            if (correcto!=1) {resultado.setText("Incorrecto");}
            else {resultado.setText("Correcto");}
        }

    }
}
/*
JTextField:
setText() - cambiar texto
getText() - saber texto
getText().trim - saber texto sin tener en cuenta espacios iniciales

JLabel:
etiqueta con texto
*/