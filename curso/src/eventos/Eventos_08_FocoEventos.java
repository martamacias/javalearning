package curso.src.eventos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Eventos_08_FocoEventos {
    public static void main(String[] args) {
        MarcoEventos marco1 = new MarcoEventos();
        marco1.setTitle("Marco 1");
        marco1.add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // se anula la posición por defecto
        setLayout(null);

        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        // se le da tamaño y posición
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);

        EventoDeFoco foco1 = new EventoDeFoco();
        cuadro1.addFocusListener(foco1);
    }

    // o extends FocusAdapter
    private class EventoDeFoco implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
        }

        @Override
        public void focusLost(FocusEvent e) {
            // comprovar direccion email correcta
            String email = cuadro1.getText();
            boolean comprobacion = false;

            for (int i=0; i<email.length(); i++){
                if (email.charAt(i)=='@') {
                    comprobacion = true;
                }
            }

            if (comprobacion) { 
                System.out.println("Email correcto"); 
            }else { 
                System.out.println("Email incorrecto"); 
            }
        }
    }

    // cuadros de texto
    JTextField cuadro1;
    JTextField cuadro2;
    
}

