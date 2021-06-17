package curso.src.swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// poner texto en TextArea desde código
// saltos linea on/off
public class Swing_05_AreaTexto {
    public static void main(String[] args) {
        MarcoSwing marco = new MarcoSwing();
        
        LaminaGeneralTA laminaG = new LaminaGeneralTA();
        marco.add(laminaG);

        marco.setSize(500,300);
    }
}

class LaminaGeneralTA extends JPanel{
    //declarar
    JTextArea textArea = new JTextArea(8,20);
    JScrollPane scroll = new JScrollPane(textArea);
    JPanel laminaSur = new JPanel();
    JButton botonInsert, botonSalto;

    public LaminaGeneralTA(){
        setLayout(new BorderLayout());

        botonInsert = new JButton("Insertar");
        botonSalto = new JButton("Salto on");

        AccionInsertar insertar = new AccionInsertar();
        botonInsert.addActionListener(insertar);
        AccionSaltoLinea salto = new AccionSaltoLinea();
        botonSalto.addActionListener(salto);
        
        laminaSur.add(botonInsert);
        laminaSur.add(botonSalto);
        add(scroll, BorderLayout.CENTER);
        add(laminaSur, BorderLayout.SOUTH);
    }
    private class AccionInsertar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append("Lorem ipsum dolor sit amet...");
        }
    }
    private class AccionSaltoLinea implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //saber si hay saltos de linea
            boolean saltar = !textArea.getLineWrap();
            textArea.setLineWrap(saltar);

            /*if (saltar){
                botonSalto.setText("Salto off");
            }else{
                botonSalto.setText("Salto on");
            }*/

            //condicional sin if-else
            botonSalto.setText(saltar ? "Salto off" : "Salto on");
        }
    }
}