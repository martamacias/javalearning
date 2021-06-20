package tictactoe.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicTacToeSolo {
    public static void main(String[] args) {
        new MarcoTicTac();
    }
}

// MARCO
class MarcoTicTacS extends JFrame{
    public MarcoTicTacS(){
        setVisible(true);
        setLocation(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaTicTac lamina = new LaminaTicTac();
        add(lamina);
        setSize(400, 450);
    }
}

// LAMINA
class LaminaTicTacS extends JPanel{
    //botones
    private JButton boton1 = new JButton();
    private JButton boton2 = new JButton();
    private JButton boton3 = new JButton();
    private JButton boton4 = new JButton();
    private JButton boton5 = new JButton();
    private JButton boton6 = new JButton();
    private JButton boton7 = new JButton();
    private JButton boton8 = new JButton();
    private JButton boton9 = new JButton();
    List<JButton> botones = new ArrayList<>();

    // donde va botón de reset
    private JPanel laminaBotones = new JPanel();
    private JButton reset = new JButton("RESET");
    // para manejar la partida
    private Map<String, String> index = new HashMap<>();
    private int counter = 0;

    // donde van los botones
    public LaminaTicTacS(){

        setLayout(new BorderLayout());
        add(laminaBotones);
        reset.setFont(new Font("Ubuntu", 1, 20));
        add(reset, BorderLayout.NORTH);

        laminaBotones.setLayout(new GridLayout(3,3,10,10));

        //crear accion oyente y vincularla al boton
        PonerFicha marcarBoton = new PonerFicha();

        botones.add(boton1); botones.add(boton2); botones.add(boton3);
        botones.add(boton4); botones.add(boton5); botones.add(boton6);
        botones.add(boton7); botones.add(boton8); botones.add(boton9);
        // añadir botones

        for (JButton boton: botones) {
            counter ++;
            boton.setName(""+counter);
            boton.setBackground(Color.WHITE);
            boton.addActionListener(marcarBoton);
            boton.setFont(new Font("Ubuntu", 1, 36));
            laminaBotones.add(boton);
            index.put(""+counter, "null"); //poner en map
        }

        //crear accion oyente para reset y configurarlo
        Resetear resetearTablero = new Resetear();
        reset.addActionListener(resetearTablero);
    }

    private int count = 0;
    private String ficha;
    private boolean ganador = false;
    // ACCION AL CLICAR EL BOTON
    class PonerFicha extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton boton = (JButton) e.getSource();
            String id = boton.getName();
            boolean sameButton = false;

            if (boton.getText().equals("")) {sameButton = false;}
            else {sameButton = true;}

            if (sameButton == false){
                if (count%2==0){ ficha = "X";}
                else { ficha = "O"; }
                count ++;
                boton.setText(ficha);
                index.replace(id, "null", ficha);
            }

            if (count==1){fichaPC1();}
            

            ganador = HayGanador();
            if (ganador){
                reset.setText("Han ganado las "+boton.getText()+"!! RESET");
                BloquearBotones();
                
            } else if (!index.containsValue("null")){
                reset.setText("EMPATE!! RESET");
                BloquearBotones();
            }
            
        }

        private void fichaPC1() {
            if (count%2==0){ ficha = "X";}
            else { ficha = "O";}

            if (!index.get("1").equals("null") || !index.get("3").equals("null") || !index.get("7").equals("null") ||!index.get("9").equals("null")) {
                botones.get(4).setText(ficha);
                index.replace(""+5, "null", ficha);
                count ++;
            } else if (!index.get("5").equals("null")){
                botones.get(0).setText(ficha);
                index.replace(""+1, "null", ficha);
                count ++;
            }
        }

        private void BloquearBotones() {
            for (JButton boton: botones){
                boton.setEnabled(false);
            }
        }
    }

    class Resetear extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            for (JButton button: botones) {
                index.replace(button.getName(), button.getText(), "null");
                button.setText("");
                button.setEnabled(true);
            }
            reset.setText("RESET");
            ganador = false;
            count = 0;
        }
    }

    private boolean HayGanador(){
        //comprobar lineas opciones diferentes
        boolean h1 = (index.get("1").equals(index.get("2")) && index.get("2").equals(index.get("3")) && !index.get("1").equals("null"));
        boolean h2 = (index.get("4").equals(index.get("5")) && index.get("5").equals(index.get("6")) && !index.get("4").equals("null"));
        boolean h3 = (index.get("7").equals(index.get("8")) && index.get("8").equals(index.get("9")) && !index.get("7").equals("null"));
        boolean v1 = (index.get("1").equals(index.get("4")) && index.get("4").equals(index.get("7"))  && !index.get("1").equals("null"));
        boolean v2 = (index.get("2").equals(index.get("5")) && index.get("5").equals(index.get("8")) && !index.get("2").equals("null"));
        boolean v3 = (index.get("3").equals(index.get("6")) && index.get("6").equals(index.get("9")) && !index.get("3").equals("null"));
        boolean d1 = (index.get("1").equals(index.get("5")) && index.get("5").equals(index.get("9")) && !index.get("1").equals("null"));
        boolean d2 = (index.get("3").equals(index.get("5")) && index.get("5").equals(index.get("7")) && !index.get("3").equals("null"));

        return (h1 || h2 || h3 || v1 || v2 || v3 || d1 || d2);
    }
}