package curso.src.tres;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        setSize(400, 400);
    }
}

// LAMINA
class LaminaTicTac extends JPanel{

    /*JButton boton1 = new JButton();
    JButton boton2 = new JButton();
    JButton boton3 = new JButton();
    JButton boton4 = new JButton();
    JButton boton5 = new JButton();
    JButton boton6 = new JButton();
    JButton boton7 = new JButton();
    JButton boton8 = new JButton();
    JButton boton9 = new JButton();*/

    public LaminaTicTac(){
        setLayout(new GridLayout(3,3,10,10));

        //crear accion oyente y vincularla al boton
        PonerFicha marcarBoton = new PonerFicha();

        // añadir botones
        for (int i = 1; i < 10; i++) {
            JButton boton = new JButton();
            boton.setBackground(Color.WHITE);
            boton.addActionListener(marcarBoton);
            boton.setFont(new Font("Ubuntu", 1, 36));
            add(boton);
        }
    }

    private int count = 0;
    private String ficha;
    // ACCION AL CLICAR EL BOTON
    class PonerFicha extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (count%2==0){
                ficha = "X";
            } else {
                ficha = "O";
            }
            putValue(Action.NAME, ficha);
            count ++;
        }
    }
}

