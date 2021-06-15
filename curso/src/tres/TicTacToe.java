package curso.src.tres;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class TicTacToe {
    public static void main(String[] args) {
        new MarcoTicTac();
    }
}

// MARCO
class MarcoTicTac extends JFrame{
    public MarcoTicTac(){
        setVisible(true);
        setLocation(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaTicTac lamina = new LaminaTicTac();
        add(lamina);
        setSize(400, 450);
    }
}

// LAMINA
class LaminaTicTac extends JPanel{

    // donde va botón de reset
    private JPanel laminaBotones = new JPanel();
    private JButton reset = new JButton("RESET");
    private Map<String, String> index = new HashMap<>();
    // donde van los botones
    public LaminaTicTac(){
        setLayout(new BorderLayout());
        add(laminaBotones);
        reset.setFont(new Font("Ubuntu", 1, 20));
        add(reset, BorderLayout.NORTH);

        laminaBotones.setLayout(new GridLayout(3,3,10,10));

        //crear accion oyente y vincularla al boton
        PonerFicha marcarBoton = new PonerFicha();

        // añadir botones
        for (int i = 1; i < 10; i++) {
            JButton boton = new JButton();
            boton.setName(""+i);
            boton.setBackground(Color.WHITE);
            boton.addActionListener(marcarBoton);
            boton.setFont(new Font("Ubuntu", 1, 36));
            laminaBotones.add(boton);
            index.put(""+i, "null");
        }
    }

    private int count = 0;
    private String ficha;
    // ACCION AL CLICAR EL BOTON
    class PonerFicha extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String id = boton.getName();
            
            if (count%2==0){ ficha = "X";} 
            else { ficha = "O"; }
            count ++;
            boton.setText(ficha);

            index.replace(id, "null", ficha);
            if (!index.containsValue("null")) {
                reset.setBackground(Color.RED);
            }
        }
    }
}

// cuando acaba partida (de momento todos marcados)
// no poder marcar botones marcados
// quien gana / pierde + acaba partida